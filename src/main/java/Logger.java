import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Logger {
    // Запрещаем пользователям пользоваться конструктором нашего класса
    private Logger() {
    }

    SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    Date date = new Date();
    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + formater.format(date) + " " + num++ + "] " + msg);
    }

    // В этом поле храним ссылку на тот единственный объект этого класса
    // который будем отдавать пользователям
    private static Logger logger;

    // Пользователи которым нужен объект нашего класса получают всегда один
    // и тот же объект, который мы храним в приватном статичном поле, которое
    // мы заполняем в этом методе если оно до того не было заполнено
    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
    List<Integer> source = new ArrayList<>();
    // метод создания случайного списка
    public List<Integer> add(int N, int M) {

        Random random = new Random();
        for (int i = 0; i < N; i++) {
            int randomInt = random.nextInt(M);
            source.add(randomInt);
        }
        return source;
    }
}
