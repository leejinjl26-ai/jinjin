package ch4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/*
	DB/items.csv을 읽어와 리스트List<ItemsDTO>로 저장
	CRUD 작업 후 다시 .csv 파일로 저장
 */
public class ItemsDAO {

	private List<ItemsDTO> itemsList;
	private String filename;

	// 파일 경로를 받아 리스트를 초기화
	public ItemsDAO(String filename) {
		this.filename = filename;
		this.itemsList = loadCsv(filename);
	}

	// csv 파일에서 내용 읽기
	private List<ItemsDTO> loadCsv(String filename) {
		List<ItemsDTO> list = new ArrayList<>();
		/*
		 * try-catch : 프로그램 실행 중 오류가 발생해도 프로그램이 멈추지 않고 돌아가게 해 줌
		 * 
		 * BufferedReader br = new BufferedReader(new FileReader(filename)); 문서를 한 줄씩 읽게 해줌
		 * 
		 */
		
		// try(...)-with-resources (자동 닫기)
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			
			String line;// 외부 파일에서 읽어온 한 줄의 데이터를 저장
			boolean isSkip = true;

			while ((line = br.readLine()) != null) {// 한 줄씩 읽다가 마지막 줄을 읽고나면 null이 되니까 종료

				// 두번째 줄을 읽을 때는 isSkip = false 이기 때문에 이 구문은 실행 x
				if (isSkip) {// 처음 문서를 읽으면 첫번째 줄부터 읽음. true
					isSkip = false;// 변수를 false;
					continue;// 첫번째 줄은 건너띄기, 혹은 넘어간 뒤 다시 반복
				}

				// 문자열 배열로 저장
				String[] parts = line.split(",");// .split(",") 쉼표를 기준으로 나누기

				int id = Integer.parseInt(parts[0].trim());// 문자열로 나눈 것을 정수로 변환
				String name = parts[1].trim();
				int qty = Integer.parseInt(parts[2].trim());
				int price = Integer.parseInt(parts[3].trim());

				// 새로운 ItemsDTO 객체를 만들고 리스트에 추가
				list.add(new ItemsDTO(id, name, qty, price));
			}
		} catch (FileNotFoundException e) {// 문서를 찾지 못한 에러
			e.printStackTrace();
		} catch (Exception e) {// 그 외 모든 오류
			System.out.println(e.getMessage() + "그 외 모든 오류");
		} 

		return list;
	}

	// 상품 추가
	public void save(ItemsDTO dto) {
		itemsList.add(dto);
		writeCsv();
	}

	// csv 파일에 저장
	private void writeCsv() {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(filename));
			pw.println("id,name,qty,price");// 타이틀
			for (ItemsDTO dto : itemsList) {
				pw.printf("%d, %s, %d, %d\n", dto.getId(), dto.getName(), dto.getQty(), dto.getPrice());
			}
		} catch (IOException e) {
			System.out.println("저장 실패: " + e.getMessage());
		} finally {// 무조건 실행
			pw.close();
		}
	}

	// 전체 목록 반환
	public List<ItemsDTO> findAll() {
		return itemsList;
	}

	// 개별 목록 반환
	/*
	public ItemsDTO findById(int id) {
		for(ItemsDTO dto : itemsList) {
			if(dto.getId() == id) return dto; 
		}
		return null;
	}
	*/
	public ItemsDTO findById(int id) {
		return itemsList.stream()
				.filter(item -> item.getId() == id)
				.findFirst()
				.orElse(null);// else와 같은 역할로 위의 조건을 만족하지 못하면 null 반환
	}

	// 삭제
	/*
	public boolean deleteById(int id) {
		for(int i=0; i<itemsList.size(); i++) {
			if(itemsList.get(i).getId() == id) {
				itemsList.remove(i);
				writeCsv();
				return true;
			}
		}
		return false;
	}
	*/
	public boolean deleteById(int id) {
		// 조건에 맞으면 객체 전부를 한 번에 삭제
		boolean removeItem = itemsList.removeIf(item -> item.getId() == id);
		if(removeItem) writeCsv();// 값이 참인 경우 호출
		return removeItem;
	}

	// 수정
	public boolean updateItem(int id, String newName, int newQty, int newPrice) {
		ItemsDTO dto = findById(id);
		if(dto != null) {
			dto.setName(newName);
			dto.setQty(newQty);
			dto.setPrice(newPrice);
			writeCsv();
			return true;
		}
		return false;
	}

	public int count() {
		return itemsList.size();
	}
	

}