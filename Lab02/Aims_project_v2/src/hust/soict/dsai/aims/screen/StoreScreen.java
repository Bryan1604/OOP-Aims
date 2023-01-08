package hust.soict.dsai.aims.screen;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
public class StoreScreen extends JFrame {
    private Store store;
    private Cart cart;
    public StoreScreen(Store store, Cart cart){
        this.store = store;
        this.cart = cart;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(),BorderLayout.NORTH);
        cp.add(createCenter(),BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024,768);
    }

    //create the north component
    JPanel createNorth(){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north,BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar(){
        JMenu menu = new JMenu("VDL-Options");
        JMenu smUpdateStore = new JMenu("VDL-Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));

        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View Store"));
        menu.add(new JMenuItem("View Cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    // Create header
    JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("VDL-AIMS");
        title.setFont(new Font(title.getFont().getName(),Font.PLAIN,50));
        title.setForeground(Color.CYAN);

        JButton cart = new JButton("View cart");
        cart.setPreferredSize(new Dimension(100,50));
        cart.setMaximumSize(new Dimension(100,50));

        header.add(Box.createRigidArea(new Dimension(10,10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10,10)));

        return header;
    }

    //the center component
    JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3,2,2));

        List<Media> mediaInStore = store.getItemsInStore();

        for(int i=0; i<mediaInStore.size();i++){
            MediaStore cell = new MediaStore(mediaInStore.get(i),cart);
            center.add(cell);
        }
        return center;
    }

    public static void main(String[] args){
        Track track1 = new Track("khkh",1);
        Track track2 = new Track("JKJKK",3);
        List<Track> trackList = new ArrayList<>();
        trackList.add(track1);
        trackList.add(track2);
        CompactDisc media1 = new CompactDisc(1,"helo","English",12,"kkkk",12,"James",trackList) ;
        CompactDisc media2 = new CompactDisc(2,"helo2","English2",12,"kkkk",12,"James",trackList) ;
        CompactDisc media3 = new CompactDisc(3,"helo3","English3",12,"kkkk",12,"James",trackList) ;
        CompactDisc media4 = new CompactDisc(4,"helo4","English4",12,"kkkk",12,"James",trackList) ;
        CompactDisc media5 = new CompactDisc(5,"helo5","English5",12,"kkkk",12,"James",trackList) ;
        CompactDisc media6 = new CompactDisc(6,"helo6","English6",12,"kkkk",12,"James",trackList) ;
        CompactDisc media7 = new CompactDisc(7,"helo7","English7",12,"kkkk",12,"James",trackList) ;
        CompactDisc media8 = new CompactDisc(8,"helo8","English8",12,"kkkk",12,"James",trackList) ;
        CompactDisc media9 = new CompactDisc(9,"helo9","English9",12,"kkkk",12,"James",trackList) ;

        DigitalVideoDisc DVD1 = new DigitalVideoDisc(10,"DVD","Music","Art",-2,45);
        Store store = new Store();
        store.addMedia(media1);
        store.addMedia(media2);
        store.addMedia(media3);
        store.addMedia(media4);
        store.addMedia(media5);
        store.addMedia(media6);
        store.addMedia(media7);
        store.addMedia(media7);
        store.addMedia(DVD1);

        Cart cart = new Cart();

        new StoreScreen(store, cart);
    }


}
