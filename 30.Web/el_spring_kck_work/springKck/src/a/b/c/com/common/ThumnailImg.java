package a.b.c.com.common;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.renderable.ParameterBlock;
import java.io.File;

import javax.imageio.ImageIO;
import javax.media.jai.JAI;
import javax.media.jai.RenderedOp;

// 썸네일 관련 설정
public abstract class ThumnailImg {
	
	// "파일 업로드 경로"와 "파일 이름"을 넣어 함수 실행
	// 
	public static void thumnailFun(String uploadPath,String filename){
		System.out.println("ThumnailFun.thumnailFun() 진입 >>> : ");
		System.out.println("uploadPath >>> : " + uploadPath);
		System.out.println("filename >>> : " + filename);
		
		// 파일 객체 생성
		File file = null;
		
		try{
			// 파라미터블럭 만들기 받은 경로의 하위경로에 파일이름을 씀
			ParameterBlock pb = new ParameterBlock();
			pb.add(uploadPath + "\\" + filename);
			
			// 파일을 렌더링해서 올리는 과정?
			// RenderedOp를 이용해 버퍼로 저장된 이미지를 가져옴
			// BufferedImage에 저장
			RenderedOp rOp = JAI.create("fileload", pb);
			BufferedImage bi = rOp.getAsBufferedImage();
			
			// 썸네일 배경크기와 썸네일색상
			BufferedImage thumb = new BufferedImage(50, 50, BufferedImage.TYPE_INT_RGB);
			Graphics2D g = thumb.createGraphics();
			
			// 썸네일 색상,위치 ,썸네일의 크기
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, 50, 50);
			g.drawImage(bi,0,0,50,50,null);
			
			//g.setComposite(AlphaComposite.Clear);
			//g.fillRect(0, 0, 500, 500);
			//g.setComposite(AlphaComposite.Src);
			
			// 파일경로\\sm_파일이름 형태로  파일을 새로 만듬?
			// 버퍼된 이미지 파일을 jpg확장자로 생성
			// 파일의 이름 출력해보기
			file = new File(uploadPath + "\\sm_" + filename);
			ImageIO.write(thumb,"jpg",file);
			System.out.println("uploadPath/" + file.getName());
			
		}catch(Exception e){
			System.out.println("ThumnailImg.thumnailFun() >>> : " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
