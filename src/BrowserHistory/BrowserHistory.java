package BrowserHistory;

import java.util.Stack;

public class BrowserHistory {

    Stack<String>future=new Stack<>();
    Stack<String> history = new Stack<>();

    public BrowserHistory(String homePage)
    {
       this.history.add(homePage);
       future.clear();

    }
    public void visit(String Url)
    {
        this.history.add(Url);
        future.clear();
    }
    public  String Back(int steps)
    {
        while(steps>0 && history.size()>1)
        {
            future.add(history.pop());
            steps--;
        }
        return history.peek();
    }
    public  String forward(int steps)
    {
        while(steps>0 && future.size()>0)
        {
            history.add(future.pop());
            steps--;
        }
        return history.peek();
    }
}
