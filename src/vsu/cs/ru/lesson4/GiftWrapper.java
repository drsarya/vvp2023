package vsu.cs.ru.lesson4;

public class GiftWrapper {

    public static void main(String[] args) {
        ArgumentParser.ArgsInfo argsInfo = ArgumentParser.parseArgs(args);
        Wrapper g = new Wrapper(argsInfo.getContent());
        for (int i = 0; i < argsInfo.getWrapperCount(); i++) {
            g.wrap();
        }

        unwrapObject(g);
        //unwrapGiftByCycle(g);
    }

    /**
     * Рекурсивное извлечение обёрнутого объекта
     */
    public static void unwrapObject(Wrapper wrapper) {
        if (!wrapper.isWrapped()) {
            return;
        }
        wrapper.unwrap();
        unwrapObject(wrapper);
    }


    /**
     * Извлечение обёрнутого объекта через цикл
     */
    public static Wrapper unwrapGiftByCycle(Wrapper wrapper) {
        while (wrapper.isWrapped()) {
            wrapper.unwrap();
        }
        return wrapper;
    }
}

