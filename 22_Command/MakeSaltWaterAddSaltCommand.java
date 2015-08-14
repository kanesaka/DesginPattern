import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class MakeSaltWaterAddSaltCommand extends Command {
  List<Command> commandList = new LinkedList<Command>();

  public void execute() {
    Iterator iterator = commandList.iterator();
    while (iterator.hasNext()) {
      ((Command)iterator.next()).execute();
    }
    System.out.println("実験終わり");
    beaker.note();
  }

  public void addCommand(Command command) {
    commandList.add(command);
  }
}
