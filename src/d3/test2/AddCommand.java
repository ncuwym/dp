package d3.test2;

import java.util.ArrayList;

public class AddCommand extends Command{
    private Invoker invoker = new Invoker();
    private ArrayList<Integer> un = new ArrayList<>();
    private ArrayList<Integer> re = new ArrayList<>();

    @Override
    public int undo() {
        int i = 0;
        int size = un.size();
        if (size == 0){
            i = -1;
        }
        else {
            int e = un.get(size - 1);
            un.remove(size - 1);
            re.add(e);
            if (size-2 > -1){
                i = un.get(size - 2);
            }
        }
        return i;
    }

    @Override
    public int redo() {
        int i = 0;
        int size = re.size();
        if (size == 0){
            i = -1;
        }
        else {
            int e = re.get(size - 1);
            re.remove(size - 1);
            un.add(e);
            i = e;
        }
        return i;
    }

    @Override
    public int execute(int value) {
        int v = 0;
        int unSize = un.size();
        int reSize = re.size();
        if (unSize == 0){
            v = invoker.add(value);
            un.add(v);
        }
        else {
            v= invoker.add(value);
            un.add(v);
            if(reSize != 0){
                for (int i = reSize-1; i >= 0; i--){
                    re.remove(i);
                }
            }
        }
        return v;
    }
}
