package legacyCollection;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("Richcy");
        names.push("Dian");
        names.push("Sukma");

        for (var name = names.pop(); name != null; name = names.pop()){
            System.out.println(name);
        }
    }
}
