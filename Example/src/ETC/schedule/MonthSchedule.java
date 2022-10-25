package ETC.schedule;

import java.util.Scanner;

public class MonthSchedule {
	static Scanner scan = new Scanner(System.in);
	static int day;			// 총 일 수
	static int i;				// 일
	String work;
	static String[] works;
//	static Day[] works;
	
	public MonthSchedule(int x) {
		day = x;
		works = new String[x];
//		works = new Day[x];
//		Arrays.fill(works, "*");
		
	}
	
	
	public void input() {
		System.out.println("날짜 (1 ~ "+ day + ") >>");
		i = scan.nextInt();
		System.out.print("할 일 (빈칸 없이 입력)>>");
		work = scan.next();
		works[i-1] = work;
//		works[i-1].set(work);
		
	}
	public void view() {
		System.out.println("날짜 (1 ~ "+ day + ") >>");
		i = scan.nextInt();
		if((i<1) || (i>day))
			System.out.println("없는 날짜 입니다.");
		Day day2 = new Day();
		day2.set(works[i-1]);
		System.out.print(i + "일의 할 일은 ");
		day2.show();
//		if (works[i-1].get() == "*")
//			works[i-1].set(null);
//		else
//			System.out.println(i + "일의 할 일은 ");
//		works[i-1].show();
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		scan.close();
		
	}
	public void run() {
		int num;
		boolean bool = true;
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(bool) {
			System.out.print("할 일 (입력 : 1, 보기 : 2, 끝내기 : 3)  >>");
			num = scan.nextInt();
			if (num==1) {
				input();
			}
			else if (num==2) {
				view();
			}
			else if (num==3) {
				finish();
				bool = false;
			}
			else System.out.println("숫자를 다시 입력해주세요");
		}
		
	}
	
}
