package ch08.class09;


public class Song {
	// 필드
	public String title;
	public String artist;
	public String album;
	public String composer;
	public int year;
	public int track;
	
	// 메서드
	public void setSongInfo(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void show() {
		System.out.println("노래제목: " + this.title);
		System.out.println("가수: " + this.artist);
		System.out.println("앨범제목: " + this.album);
		System.out.println("작곡가: " + this.composer);
		System.out.println("발표연도: " + this.year);
		System.out.println("앨범 트랙 번호: " + this.track);
	}
}
