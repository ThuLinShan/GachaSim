package com.example.gachademo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class Scene2Controller {

    @FXML Button back;
    @FXML ImageView view1;
    @FXML ImageView view2;
    @FXML ImageView view3;
    @FXML ImageView view4;
    @FXML ImageView view5;
    @FXML ImageView view6;
    @FXML ImageView view7;
    @FXML ImageView view8;
    @FXML ImageView view9;
    @FXML ImageView view10;

    Image image1;
    Image image2;
    Image image3;
    Image image4;
    Image image5;
    Image image6;
    Image image7;
    Image image8;
    Image image9;
    Image image10;

    @FXML
    Button onePull;
    @FXML
    Button tenPull;

    Random random = new Random();
    private Stage stage;
    private Scene scene;
    private FXMLLoader root;

    String[] fiveStars = {"ayato.jpg","diluc.jpg","eula.jpg","ganyu.jpg","hu tao.jpg","kazuha.jpg","keqing.jpg","klee.jpg","kokomi.jpg","miko.jpg","qiqi.jpg",
                          "raiden.jpg","shenhe.jpg","tighnari.jpg","venti.jpg","xiao.jpg","yoimiya.jpg","zhongli.jpg"};
    String[] fourStars = {"barbara.jpg","chongyun.jpg","collei.jpg","diona.jpg","kujou sara.jpg","sucrose.jpg","xingqiu.jpg","yun jin.jpg"};
    String weapon = "sword.png";

    public void back(ActionEvent e) throws IOException {
        root = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root.load());
        stage.setScene(scene);
        stage.setTitle("May gacha god bless you.");
        stage.show();
    }

    public void onePullAction(ActionEvent e){
        view1.setImage(null);
        view2.setImage(null);
        view3.setImage(null);
        view4.setImage(null);
        view6.setImage(null);
        view7.setImage(null);
        view8.setImage(null);
        view9.setImage(null);
        view10.setImage(null);

        random = new Random();
        int pull = random.nextInt(1000);
        if (pull<6){
            int fiveStar = random.nextInt(fiveStars.length-1);
            image1 = new Image(getClass().getResourceAsStream(fiveStars[fiveStar]));
            view5.setImage(image1);
        }
        else{
            int lowpull = random.nextInt(1000);
            if (lowpull<11){
                int fourStar = random.nextInt(fourStars.length-1);
                image1 = new Image(getClass().getResourceAsStream(fourStars[fourStar]));
                view5.setImage(image1);
            }
            else{
                image1 = new Image(getClass().getResourceAsStream("sword.png"));
                view5.setImage(image1);
            }
        }
    }

    public void tenPullAction(ActionEvent e){
        random = new Random();
        int pull = random.nextInt(1000);
        if (pull<6){
            int fiveStar = random.nextInt(fiveStars.length-1);
            image1 = new Image(getClass().getResourceAsStream(fiveStars[fiveStar]));
            view1.setImage(image1);
        }
        else {
                int fourStar = random.nextInt(fourStars.length - 1);
                image1 = new Image(getClass().getResourceAsStream(fourStars[fourStar]));
                view1.setImage(image1);
        }



        int pull2 = random.nextInt(1000);
        if (pull2<6){
            int fiveStar = random.nextInt(fiveStars.length-1);
            image2 = new Image(getClass().getResourceAsStream(fiveStars[fiveStar]));
            view2.setImage(image2);
        }
        else{
            int lowpull = random.nextInt(1000);
            if (lowpull<11){
                int fourStar = random.nextInt(fourStars.length-1);
                image2 = new Image(getClass().getResourceAsStream(fourStars[fourStar]));
                view2.setImage(image2);
            }
            else{
                image1 = new Image(getClass().getResourceAsStream("sword.png"));
                view2.setImage(image1);
            }
        }


        int pull3 = random.nextInt(1000);
        if (pull3<6){
            int fiveStar = random.nextInt(fiveStars.length-1);
            image3 = new Image(getClass().getResourceAsStream(fiveStars[fiveStar]));
            view3.setImage(image3);
        }
        else{
            int lowpull = random.nextInt(1000);
            if (lowpull<11){
                int fourStar = random.nextInt(fourStars.length-1);
                image3 = new Image(getClass().getResourceAsStream(fourStars[fourStar]));
                view3.setImage(image3);
            }
            else{
                image3 = new Image(getClass().getResourceAsStream("sword.png"));
                view3.setImage(image3);
            }
        }

        random = new Random();
        int pull4 = random.nextInt(1000);
        if (pull4<6){
            int fiveStar = random.nextInt(fiveStars.length-1);
            image4 = new Image(getClass().getResourceAsStream(fiveStars[fiveStar]));
            view4.setImage(image4);
        }
        else{
            int lowpull = random.nextInt(1000);
            if (lowpull<11){
                int fourStar = random.nextInt(fourStars.length-1);
                image4 = new Image(getClass().getResourceAsStream(fourStars[fourStar]));
                view4.setImage(image4);
            }
            else{
                image4 = new Image(getClass().getResourceAsStream("sword.png"));
                view4.setImage(image4);
            }
        }


        int pull5 = random.nextInt(1000);
        if (pull5<6){
            int fiveStar = random.nextInt(fiveStars.length-1);
            image5 = new Image(getClass().getResourceAsStream(fiveStars[fiveStar]));
            view5.setImage(image5);
        }
        else{
            int lowpull = random.nextInt(1000);
            if (lowpull<11){
                int fourStar = random.nextInt(fourStars.length-1);
                image5 = new Image(getClass().getResourceAsStream(fourStars[fourStar]));
                view5.setImage(image5);
            }
            else{
                image5 = new Image(getClass().getResourceAsStream("sword.png"));
                view5.setImage(image5);
            }
        }


        random = new Random();
        int pull6 = random.nextInt(1000);
        if (pull6<6){
            int fiveStar = random.nextInt(fiveStars.length-1);
            image6 = new Image(getClass().getResourceAsStream(fiveStars[fiveStar]));
            view6.setImage(image6);
        }
        else{
            int lowpull = random.nextInt(1000);
            if (lowpull<11){
                int fourStar = random.nextInt(fourStars.length-1);
                image6 = new Image(getClass().getResourceAsStream(fourStars[fourStar]));
                view6.setImage(image6);
            }
            else{
                image6 = new Image(getClass().getResourceAsStream("sword.png"));
                view6.setImage(image6);
            }
        }


        int pull7 = random.nextInt(1000);
        if (pull7<6){
            int fiveStar = random.nextInt(fiveStars.length-1);
            image7 = new Image(getClass().getResourceAsStream(fiveStars[fiveStar]));
            view7.setImage(image7);
        }
        else{
            int lowpull = random.nextInt(1000);
            if (lowpull<11){
                int fourStar = random.nextInt(fourStars.length-1);
                image7 = new Image(getClass().getResourceAsStream(fourStars[fourStar]));
                view7.setImage(image7);
            }
            else{
                image7 = new Image(getClass().getResourceAsStream("sword.png"));
                view7.setImage(image7);
            }
        }


        int pull8 = random.nextInt(1000);
        if (pull8<6){
            int fiveStar = random.nextInt(fiveStars.length-1);
            image8 = new Image(getClass().getResourceAsStream(fiveStars[fiveStar]));
            view8.setImage(image8);
        }
        else{
            int lowpull = random.nextInt(1000);
            if (lowpull<11){
                int fourStar = random.nextInt(fourStars.length-1);
                image8 = new Image(getClass().getResourceAsStream(fourStars[fourStar]));
                view8.setImage(image8);
            }
            else{
                image8 = new Image(getClass().getResourceAsStream("sword.png"));
                view8.setImage(image8);
            }
        }


        random = new Random();
        int pull9 = random.nextInt(1000);
        if (pull9<6){
            int fiveStar = random.nextInt(fiveStars.length-1);
            image9 = new Image(getClass().getResourceAsStream(fiveStars[fiveStar]));
            view9.setImage(image9);
        }
        else{
            int lowpull = random.nextInt(1000);
            if (lowpull<11){
                int fourStar = random.nextInt(fourStars.length-1);
                image9 = new Image(getClass().getResourceAsStream(fourStars[fourStar]));
                view9.setImage(image9);
            }
            else{
                image9 = new Image(getClass().getResourceAsStream("sword.png"));
                view9.setImage(image9);
            }
        }


        int pull10 = random.nextInt(1000);
        if (pull10<6){
            int fiveStar = random.nextInt(fiveStars.length-1);
            image10 = new Image(getClass().getResourceAsStream(fiveStars[fiveStar]));
            view10.setImage(image10);
        }
        else{
            int lowpull = random.nextInt(1000);
            if (lowpull<11){
                int fourStar = random.nextInt(fourStars.length-1);
                image10 = new Image(getClass().getResourceAsStream(fourStars[fourStar]));
                view10.setImage(image10);
            }
            else{
                image10 = new Image(getClass().getResourceAsStream("sword.png"));
                view10.setImage(image10);
            }
        }
    }
}
