package hust.soict.dsai.aims.media;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.exception.PlayerException;

import javax.swing.*;
import java.awt.*;
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
        // create the layout
        int size = tracks.size();
        JPanel layout = new JPanel(new GridLayout(size,1));

        for(Track track: tracks){
            //create the label
            JLabel content = new JLabel("VDL - " + track.toString());
            content.setHorizontalAlignment(SwingConstants.CENTER);
            layout.add(content);
        }
        //create a dialog
        JDialog dialog = new JDialog();
        dialog.setSize(400,400);
        dialog.add(layout);
        dialog.setTitle("VDL - Play CD: ");
        dialog.setVisible(true);
    }

    public String getArtist() {
        return artist;
    }
    // add track
    public void addTrack(Track track){
        if(!this.tracks.contains(track)){
            tracks.add(track);
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
