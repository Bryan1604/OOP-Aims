package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediaStore extends JPanel {
    private Media media;
    public MediaStore(Media media, Cart cart){
        this.media = media;
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(),Font.PLAIN,20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost()+ " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        // add to cart Button
        JButton addToCartBtn = new JButton("Add to Cart");
        addToCartBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    cart.addMedia(media);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println(media.getTitle()+ " Added to Cart");
            }
        });
        container.add(addToCartBtn);

        if(media instanceof Playable){
            JButton playAction = new JButton("Play");
            container.add(playAction);
            playAction.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try {
                        ((Playable) media).play();
                    } catch (PlayerException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
