package hust.soict.dsai.aims.media;
import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable{
    private String title;
    private int length;

    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }



    public boolean equals(Object obj){
        if(obj instanceof Track){
            Track track = (Track) obj;
            return this.title.equals(track.title) && this.length== track.getLength();
        }
        return false;
    }

    public void play() throws PlayerException{
        if(this.getLength()>0){
            System.out.println("Playing Track: " + this.getTitle());
            System.out.println("Track length : " + this.getLength());
        }else {
            System.err.println("Error: DVD length is non-positive!");
            throw new PlayerException("ERROR: track length is non-positive!");
        }

    }

    public String toString(){
        return "Track: "+ this.getTitle()+" - "+ this.getLength() + " minuties";
    }
}

