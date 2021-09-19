package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import a.b.c.common.*;

public class Ex_URL_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			String filePath = FilePath.FILE_PATH_CH8;
			String path = filePath + "/" + "index.html";

			String urlStr = "https://www.naver.com";

			URL ur = new URL(urlStr);
			BufferedReader br = new BufferedReader(new InputStreamReader(ur.openStream(), "UTF-8"));

			String inLine = "";

			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			while ((inLine = br.readLine()) != null) {
				System.out.println(inLine);
				bw.write(inLine);
			}
			bw.flush();
			bw.close();
			br.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
