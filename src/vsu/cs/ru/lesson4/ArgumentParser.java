package vsu.cs.ru.lesson4;

public class ArgumentParser {

    public static class ArgsInfo {

        private Integer wrapperCount;
        private String content;

        public Integer getWrapperCount() {
            return wrapperCount;
        }

        public void setWrapperCount(Integer wrapperCount) {
            this.wrapperCount = wrapperCount;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public static ArgsInfo parseArgs(String[] args) {
        if (args.length != 4) {
            throw new IllegalArgumentException("Args must contain four parameters");
        }

        ArgsInfo argsInfo = new ArgsInfo();
        for (int i = 0; i < args.length; i += 2) {
            // content key
            if (args[i].equals("-c")) {
                argsInfo.content = args[i + 1];
            }

            // wrapper key
            if (args[i].equals("-w")) {
                argsInfo.wrapperCount = Integer.parseInt(args[i + 1]);
            }
        }
        return argsInfo;
    }
}
