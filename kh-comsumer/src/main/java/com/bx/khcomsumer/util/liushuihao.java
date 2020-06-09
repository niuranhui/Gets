package com.bx.khcomsumer.util;

import java.util.concurrent.atomic.AtomicInteger;

public class liushuihao {
    public static String[] sn(int len,Integer i,String driver,String prefix,int limited){
        String[] result = new String[4];
        AtomicInteger z = new AtomicInteger(i);
        AtomicInteger x = new AtomicInteger(i);
        driver = driver==null?"":driver;
        prefix = prefix==null||prefix.equals("null")?"":prefix;
        //1.判断流水号长度是否大于约定长度
        if(z.toString().length()<=(len-driver.length())){
            if(Integer.valueOf(x.incrementAndGet()).toString().length()>(len-driver.length())||(driver.length()>limited && limited!=-1)){
                System.out.println("默认索引超出范围,需从字母A开始重新一轮的流水号");
                //2.如果流水号+字母长度超过了最大限度修改新的长度
                //len=String.valueOf(x.get()).length();
                int temp  = String.valueOf(x.get()).length();

                AtomicInteger atomicInteger = new AtomicInteger(0);
                char[] charArray = driver.toCharArray();

                for (char c : charArray) {
                    if(c=='Z'){
                        atomicInteger.getAndIncrement();
                    }
                }

                if((temp+driver.length()>len && atomicInteger.intValue()==driver.length() && driver.length()>0) ||(driver.length()>limited && limited!=-1)){
                    System.out.println("如果流水号+字母长度超过了最大限度修改新的长度,并重新开始一轮+1的流水号");
                    len++;
                    driver="";
                }else{
                    driver = driverCheck(driver,len,limited);
                    if(driver.equals(".N")){
                        driver = "";
                    }
                }
                z.set(0);
            }



            String current = String.format("%0"+(len-driver.length())+"d",z.incrementAndGet());
            result[0]=prefix+driver+current;
            result[1]=driver;
            result[2]=String.valueOf(len);
            result[3]=String.valueOf(z.get());
            System.out.println(prefix+driver+current);
        }else{
            System.out.println("输入不合法！");
        }

        return result;
    }

    /**
     * 字母有效检查
     * 1.检查字母是否都为Z
     * 2.检查字母长度
     * @param driver
     * @param len
     * @return
     */
    public static String driverCheck(String driver,int len,int limited){
        if(driver!=null && driver.length()>0){
            AtomicInteger z = new AtomicInteger(0);
            char[] charArray = driver.toCharArray();

            for (char c : charArray) {
                if(c=='Z'){
                    z.getAndIncrement();
                }
            }

            if(z.intValue()==driver.length()){
                String result = "";
                if(z.intValue()==len && z.intValue()>limited){//如所有字母都为Z，并且长度达到限定长度，返回.N
                    System.out.println("如所有字母都为Z，并且长度达到限定长度，返回.N");
                    result = ".N";
                }else if(z.intValue()<len-1 && z.intValue()<=limited){
                    System.out.println("如果所有字母都为Z，但长度未达到限定长度,直接递增");
                    result = driver(driver+"@");
                }
                return result;
            }else{
                System.out.println("以上两个条件都不满足，则直接递增");
                return driver(driver);
            }

        }else{
            return "A";
        }
    }

    /**
     * 字母递增
     * @param driver
     * @return
     */
    public static String driver(String driver){

        if(driver!=null && driver.length()>0){
            char[] charArray = driver.toCharArray();
            boolean bool = false;
            for(int i = charArray.length-1;i>-1;i--){
                if(charArray[i]=='Z'){
                    if(i==charArray.length-1){
                        charArray[i]='A';
                        bool = true;
                    }else{
                        if(bool==true){
                            AtomicInteger atomic = new AtomicInteger(charArray[i]);
                            int val = atomic.incrementAndGet();
                            if(90>=val){
                                charArray[i]=(char) val;
                                bool = false;
                            }else{
                                charArray[i]='A';
                                bool = true;
                            }
                        }
                    }
                }else{
                    if(bool==true || (i==charArray.length-1)){
                        AtomicInteger atomic = new AtomicInteger(charArray[i]);
                        int val = atomic.incrementAndGet();
                        if(90>=val){
                            charArray[i]=(char) val;
                            bool = false;
                        }else{
                            charArray[i]='A';
                            bool = true;
                        }
                    }
                }

            }
            return String.valueOf(charArray);
        }else{
            return "A";
        }
    }


    public static void main(String[] args) {
        String[] s_= sn(5,9, "ZYAS","",-1);
        for (String string : s_) {
            System.out.println(string);
        }

    }
}

