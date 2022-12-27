package hust.soict.dsai.aims.media;

public class Track implements Playable{
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }

    public boolean equals(Object obj){
        if(obj instanceof Track){
            Track track = (Track) obj;
            return this.title.equals(track.title) && this.length== track.getLength();
        }
        return false;
    }

    public void play(){
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length : " + this.getLength());
    }
}
