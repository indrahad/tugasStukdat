import java.util.Scanner;
class index {
	// ini adalah menambah deklarasi Scanner dan String Menu dan nilai N
	public static Scanner scanner = new Scanner(System.in);
	public static String menu = "0";
	public static int N = 5;
	//membuat method
	public static void insertData(BaseData storedData[]) {
		System.out.println("// todo insertData");
		System.out.println("-----------------------------------------------------");
		showMenu(storedData);
	}

	public static void tampilData(BaseData storedData[]) {
		System.out.println("// todo showData");
		System.out.println("-----------------------------------------------------");
		showMenu(storedData);
	}

	public static void showMenuAdd(BaseData storedData[]) {
		System.out.println("Choose: ");
		System.out.println("1. Add Data in the Front");
		System.out.println("2. Add Data in the Middle");
		System.out.println("3. Add Data in the Last");
		System.out.println("4. Back");
		System.out.print("[1-4] : ");

		try {
			menu = scanner.next();
		} catch (java.util.InputMismatchException e) {
			menu = "0";
		}
		
		System.out.println("-----------------------------------------------------");

		switch (menu) {
			case "1": addDataAtFront(storedData); break;
			case "2": addDataAtMiddle(storedData); break;
			case "3": addDataAtLast(storedData); break;
			case "4": showMenu(storedData); break;
			default: 
				System.out.println("Are you kidding me?");
				showMenuAdd(storedData); 
				break;
		}
	}

	public static void addDataAtFront(BaseData storedData[]) {
		System.out.println("// todo addDataAtFront");
		System.out.println("-----------------------------------------------------");
		showMenu(storedData); 
	}

	public static void addDataAtMiddle(BaseData storedData[]) {
		System.out.println("// todo addDataAtMiddle");
		System.out.println("-----------------------------------------------------");
		showMenu(storedData); 
	}

	public static void addDataAtLast(BaseData storedData[]) {
		System.out.println("// todo addDataAtLast");
		System.out.println("-----------------------------------------------------");
		showMenu(storedData); 
	}

	public static void searchData(BaseData storedData[]) {
		System.out.println("// todo searchData");
		System.out.println("-----------------------------------------------------");
		showMenu(storedData);
	}

	public static void editData(BaseData storedData[]) {
		System.out.println("// todo editData");
		System.out.println("-----------------------------------------------------");
		showMenu(storedData);
	}

	public static void deleteData(BaseData storedData[]) {
		System.out.println("// todo deleteData");
		System.out.println("-----------------------------------------------------");
		showMenu(storedData);
	}

	public static void sortData(BaseData storedData[]) {
		System.out.println("// this should have submenu");
		System.out.println("// todo sortData");
		System.out.println("-----------------------------------------------------");
		showMenu(storedData);
	}

	public static void showMenu(BaseData storedData[]) {
		System.out.println("Choose: ");
		System.out.println("1. Insert Data");
		System.out.println("2. Show Data");
		System.out.println("3. Add Data *");
		System.out.println("4. Search Data");
		System.out.println("5. Edit Data");
		System.out.println("6. Delete Data");
		System.out.println("7. Sort Data");
		System.out.println("8. Exit");
		System.out.print("[1-8] : ");

		try {
			menu = scanner.next();
		} catch (java.util.InputMismatchException e) {
			menu = "0";
		}
		
		System.out.println("-----------------------------------------------------");

		switch (menu) {
			case "1": insertData(storedData); break;
			case "2": tampilData(storedData); break;
			case "3": showMenuAdd(storedData); break;
			case "4": searchData(storedData); break;
			case "5": editData(storedData); break;
			case "6": deleteData(storedData); break;
			case "7": sortData(storedData); break;
			case "8": 
				System.out.println("Goodby!");
				System.exit(0); 
				break;
			default: 
				System.out.println("Are you kidding me?");
				showMenu(storedData); 
				break;
		}
	}

	public static void main(String[] args) {
		// show welcome message
		System.out.println("Selamat datang di program kami !!");

		BaseData storedData[] = new BaseData[20];
		for (int i = 0; i <= N-1; i++) {
			storedData[i] = new BaseData();
		}
		
		// Go somewhere
		showMenu(storedData);
	}
}
//calass base data
class BaseData {
	String name1, name2, name3;
	int name4;
}