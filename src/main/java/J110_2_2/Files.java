package J110_2_2;


    public abstract class Files {
        private String name;
        private int size;
        private String format;

        public Files (String name, int size, String format) {
            setName(name);
            setSize(size);
            setFormat(format);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name == null)
                throw new IllegalArgumentException("Name can't be null");
            this.name = name;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            if (size <= 0)
                throw new IllegalArgumentException("Size can't be 0");
            this.size = size;
        }

        public String getFormat() {
            if (format == null) {
                throw new IllegalArgumentException("Invalid format length: " + format);
            }
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public abstract String getDetails();

        public static void printAll(Files[] files) {
            System.out.printf("%-20s | %-10s | %s\n", "File name", "Size", "Details");
            System.out.println("--------------------+------------+---------");

            for (Files file : files) {
                System.out.printf("%-20s | %-10d | %s\n", file.getName(), file.getSize(), file.getDetails());
            }
        }

    }