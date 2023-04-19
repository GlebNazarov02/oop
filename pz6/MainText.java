package pz6;

public class MainText {
    public static void main(String[] args) {

        Text text = new Text("Мама мыла раму");
        ChangingText newText = new ChangingText(text);
        newText.appendText(" собака");
        newText.findWordAndReplace("раму", "окно");
        newText.findWordAndDelete("Мама");
        System.out.println(text.toString());
        
    }
    
}