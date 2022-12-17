package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks= new ArrayList<Track>();

    public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist, List<Track> tracks){
        super(id,title,category,cost,director,length);
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play(){
        for(Track track: tracks){
            track.play();
        }
    }

    public String getArtist() {
        return artist;
    }

    // add track
    public void addTrack(Track track){
        if(!this.tracks.contains(track)){
            this.tracks.add(track);
            System.out.println(track.getTitle() + "has been added");
        }else {
            System.out.println(track.getTitle() + "has already existed");
        }
    }

    //remove track
    public void removeTrack(Track track){
        if(this.tracks.contains(track)){
            this.tracks.remove(track);
            System.out.println(track.getTitle() + "has been removed");
        }else {
            System.out.println(track.getTitle() + "has been not existed");
        }
    }

    // get length of all tracks
    public int getLength(){
        int sumLength = 0;
        for(Track track: tracks){
            sumLength = sumLength + track.getLength();
        }
        return sumLength;
    }

    public String toString(){
        return "CD : " + this.getId() + "-" + this.getTitle()+ "-" +
                this.getCategory()+ "-" + this.getDirector()+"-"+
                this.getLength()+ "-" + this.getCost()+ "$ -" +
                "artists:"+ this.getArtist()+"-"+  "tracks:" + this.tracks;
    }

}
