package Stream;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\testout.txt"); // it will create a text format file with
																				// .txt
			fout.write(65); // 65 means A
			fout.write(66);
			fout.close();
			FileOutputStream exl = new FileOutputStream("D:\\test.XLS");
			exl.write(65); // 65 means A
			exl.write(66);
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
