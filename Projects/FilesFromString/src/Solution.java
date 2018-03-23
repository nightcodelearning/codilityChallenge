import java.util.Arrays;
import java.util.List;

public class Solution {
	
	 

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder("");
        sb.append("my.song.mp3 11b\n");
        sb.append("greatSong.flac 1000b\n");
        sb.append("not3.txt 5b\n");
        sb.append("video.mp4 200b\n");
        sb.append("game.exe 100b\n");
        sb.append("mov!e.mkv 10000b\n");
       

        String text = sb.toString();
        Solution sol=new Solution();
        System.out.println(sol.solution(text));

		
	}
	
	
	public String solution(String S) {
        // write your code in Java SE 8
		int musicVal=0;
		int imageVal=0;
		int movieVal=0;
		int otherVal=0;
		
		String[] lines = S.split("\\r?\\n");
		for (String string : lines) {
			String[] arreglo=string.split(" ");	
			
			//value
			String value=arreglo[1];
			String size =arreglo[1].substring(0, arreglo[1].length() -1 );

			
			Integer amount = Integer.parseInt(size);
			
			//fileName
			String fileName=arreglo[0];
			//extension
			String extn = fileName.substring( fileName.lastIndexOf(".") );
			//evaluate extension
			if(isMusic(extn)) {
				musicVal+=amount;
			}else if(isImage(extn)) {
				imageVal+=amount;
			}else if(isMovie(extn)) {
				movieVal+=amount;
			}else {
				otherVal+=amount;
			}
			
		}
		
		StringBuilder result= new StringBuilder("");
		result.append("music ");
		result.append(musicVal+"b"+"\n");
		result.append("images ");
		result.append(imageVal+"b"+"\n");
		result.append("movies ");
		result.append(movieVal+"b"+"\n");
		result.append("other ");
		result.append(otherVal+"b");

//		String finalString = "music"+ musicVal+"b\nimages "+imageVal+"b\nmovies "+movieVal+"b\nother "+otherVal+"b";
		return result.toString();
		
    }
	
	public  static boolean isMusic(String extn) {
		List<String> musicEtxn =  Arrays.asList(".mp3", ".aac", ".flac");//Music extension
		if(musicEtxn.contains(extn)){
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isImage(String extn) {
		List<String> imageEtxn =  Arrays.asList(".jpg", ".bmp", ".gif");//Movie extension
		if(imageEtxn.contains(extn)){
			return true;
		}else {
			return false;
		}		
	}
	
	public static boolean isMovie(String extn) {
		List<String> movieEtxn =  Arrays.asList(".mp4", ".avi", ".mkv");//Image extension
		//List<String> othersEtxn =  Arrays.asList(".7z", ".txt", ".zip");//Others extension
		if(movieEtxn.contains(extn)){
			return true;
		}else {
			return false;
		}		
		
	}
	


}
