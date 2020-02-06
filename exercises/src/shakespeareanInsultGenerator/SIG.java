package shakespeareanInsultGenerator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SIG {
    private JPanel SIG;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox3;
    private JComboBox<String> comboBox2;
    private JTextField textField1;
    private JButton generate;
    private String[] comboBox1Values = new String[] {"artless", "antagonistic", "bawdy", "beslubbering", "bootless", "churlish", "cockered", "clouted", "craven", "currish", "dankish", "dissembling", "droning",
            "errant", "elephantine", "fawning", "fobbing", "froward", "frothy", "gleeking", "goatish", "gorbellied", "hypocritical", "hooch-headed", "half-eaten",
            "impertinent", "infectious", "jarring", "kettle-headed", "krakatoic", "kahootic", "loggerheaded", "lumpish", "mammering", "mangled", "mewling", "nothing-headed",
            "numbscullistic", "nickel-hydrated", "novelty-headed", "opulent", "obnoxious", "over-wheening", "odourizing", "paunchy", "pribbling", "puking", "puny", "quailing",
            "rank", "reeky", "roguish", "ruttish", "saucy", "spleeny", "spongy", "surly", "tottering", "unmuzzled", "unquantifiable", "vain", "venomed", "villainous", "warped", "wayward", "weedy", "yeasty"};

    private String[] comboBox2Values = {"apologetic", "asinine", "base-court", "bat-fowling", "beef-witted", "beetle-headed", "boil-brained", "clapper-clawed", "clay-brained", "common-kissing", "crook-pated", "dismal-dreaming",
            "dizzy-eyed", "doghearted", "dread-bolted", "earth-vexing", "elf-skinned", "facile", "fat-kidneyed", "fen-sucked", "flap-mouthed", "fly-bitten", "folly-fallen", "fool-born", "full-gorged", "guts-griping", "half-faced",
            "hasty-witted", "hedge-born", "hell-hated", "idle-headed", "ill-breeding", "ill-nurtured", "jumped-up", "jammy", "juvenile", "knotty-pated", "lily-livered", "lowly", "little", "milk-livered", "motley-minded", "ninny faced",
            "no-good", "nutty", "onion-eyed", "over-zealous", "obsequious", "plume-plucked", "pottle-deep", "pox-marked", "quiffy", "quantabulous", "quadratic", "rectum-faced", "reeling-ripe", "rough-hewn", "rubber-headed", "rude-growing",
            "rudimantal", "rump-fed", "scum-sucking", "shard-borne", "sheep-biting", "silly old", "spur-galled", "swag-bellied", "tardy-gaited", "tickle-brained", "toad-spotted", "unbelieveable", "unctuos", "urchin-snouted", "vastly overated",
            "vertiginous", "weather-bitten", "yucky", "yellow"};

    private String[] comboBox3Values = {"apple-john", "anachronistic", "baggage", "barnacle", "bladder", "boar-pig", "bugbear", "bum-bailey", "canker-blossom", "clack-dish", "clotpole", "coxcomb", "codpiece", "death-token",
            "dewberry", "el weirdo", "eraser head", "flap-dragon", "flax-wench", "flirt-gill", "foot-licker", "fustilarian", "giglet", "gudgeon", "haggard", "harpy", "hedge-pig", "horn-beast", "hugger-mugger", "idiot droid",
            "impudent fool", "insufferable pratt", "jolthead", "khazi-droid", "krill", "lewdster", "lout", "maggot-pie", "malt-worm", "mammet", "measle", "minnow", "miscreant", "moldwarp", "mumble-news", "numbscull", "nut-hook",
            "nutter", "ninny", "newt", "old codger", "old laundry chute nostrils", "olephant", "pigeon-egg", "pignut", "puttock", "pumpion", "quark brain", "quiffle", "ratsbane", "relic", "rotter", "scudball", "scut", "skainsmate",
            "smartarse", "smeghead", "strumpet", "travesty", "twit-nit", "twonk", "tyke", "ugly, lungless marine animal with galloping senility", "unbelievable git", "ungulate", "varlet", "varmint", "vassal", "vegetable", "whey-face",
            "wagtail", "yam", "young man", "youth", "yokel"};




    public SIG(){
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = (String) comboBox1.getSelectedItem();
                String letter = Character.toString(value.charAt(0));
                comboBox2.removeAllItems();
                comboBox3.removeAllItems();
                for (String word : comboBox2Values){
                    if (word.startsWith(letter)){
                        comboBox2.addItem(word);
                    }
                }
                for (String word : comboBox3Values){
                    if (word.startsWith(letter)){
                        comboBox3.addItem(word);
                    }
                }
            }
        });
        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String insult = comboBox1.getSelectedItem() + " " + comboBox2.getSelectedItem() + " " + comboBox3.getSelectedItem();
                textField1.setText(insult);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shakespearean Insult Generator");
        frame.setContentPane(new SIG().SIG);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }

    private void createUIComponents() {
        comboBox1 = new JComboBox<String>(comboBox1Values);
        comboBox3 = new JComboBox<String>(comboBox2Values);
        comboBox2 = new JComboBox<String>(comboBox3Values);

    }
}
