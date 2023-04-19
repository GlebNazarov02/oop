package pz6;

public class ChangingText {

    Text text;
    public ChangingText(Text text) {
        this.text = text;
    }
    
    public void appendText(String new_text) {
        text.setText(text.getText().concat(new_text));
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (text.getText().contains(word)) {
            text.setText(text.getText().replace(word, replacementWord));
        }
        return text.getText();
    }

    public String findWordAndDelete(String word) {
        if (text.getText().contains(word)) {
            text.setText(text.getText().replace(word, ""));
        }
        return text.getText();
    }
    
}
