import java.util.Scanner; 

public class Baseball { 

public static void main(String[] args) { 

	int com[] = new int[4]; 
	int user[] = new int[4];  
	int ch = 0; 
	int counter = 0; 

	boolean randomball = true; 

	while (randomball) { 
		for (int i=0; i<com.length; i++) { 
			com[i] = (int)(Math.random() * 9) + 1;  
		} 
		if (com[0] != com[1] && com[0] != com[2] && com[0] != com[3] && com[1] != com[2] && com[1] != com[3] && com[2] != com[3]) 
			randomball = false; 
	}

	randomball = true; 

	System.out.println("�߱����� ����"); 
	while (randomball) { 
		int strike = 0; 
		int ball = 0; 
		System.out.println("���ڸ� �Է��ϼ���"); 
		Scanner kk = new Scanner(System.in); 

		for (int i=0; i < user.length; i++) { 
			try { 
				ch = kk.nextInt(); 
				user[i] = ch; 
				if (ch > 10 || ch < 0) { 
					System.out.println("1~9�� ���ڸ� �Է��ϼ���"); 
					i--;
				} 
			} 
			catch (Exception e) { 
				System.out.println("�߸� �Է��ϼ̽��ϴ�."); 
			} 
		} 
		for (int i=0; i<com.length; i++) 
		{ 
			for (int j=0; j<user.length; j++) { 
				if (com[i] == user[j] && i == j)  
					strike++; 
				else if (com[i] == user[j] && i != j) 
					ball++; 
			} 
		} 
		if (user.length ==4)
			System.out.println(strike + "��Ʈ����ũ  " + ball + "��"); 
		if (strike == 4) 
		{ 
			randomball = false; 
		} 
		counter++; 
	} 
	System.out.println("Ƚ�� : " + counter); 
	System.out.println("���� ��"); 
	} 
}

