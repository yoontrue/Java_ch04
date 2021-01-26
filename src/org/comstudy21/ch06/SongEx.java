package org.comstudy21.ch06;
class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {
		// 기본 생성자
	}
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}
public class SongEx {
	public static void main(String[] args) {
		String title = "Dancing Queen";
		String artist = "ABBA";
		int year = 1978;
		String country = "스웨덴";
		Song Song = new Song(title,artist,year,country);
		Song.show();
	}
}
