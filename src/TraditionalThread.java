public class TraditionalThread {




    /**
     *
     * @param args
     */
    public static void main(String[] args){
        /**
         * 重写Thread对象的run方法
         */
        Thread thread = new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("1:"+ Thread.currentThread().getName());
                    System.out.println("1:" + this.getName());
                }
            }
        };
        thread.start();


        /**
         * 重写Thread对象父类Ruunable中的run方法
         */
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("2:"+ Thread.currentThread().getName());
                    //System.out.println("2;" + this.getName());
                }
            }
        });
        thread1.start();


        /**
         * 先执行本身的run方法，然后再执行父类Ruunable方法
         */
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        while (true){
                            try {
                                Thread.sleep(500);
                            }catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            System.out.println("runnable:"+ Thread.currentThread().getName());
                            //System.out.println("2;" + this.getName());
                     }
                    }
                }

        ){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Thread:"+ Thread.currentThread().getName());
                    //System.out.println("2;" + this.getName());
                }
            }
        }.start();
    }
}
