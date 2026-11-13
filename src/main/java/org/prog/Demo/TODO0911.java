//package org.prog.Demo;
//
//public class TODO0911 {
//    public static void main(String[] args) {
//        String[] emails = {
//                "john@mail.com",
//                "jo@gmail.com",
//                "peter@localhost",
//                "alex.smith@company.net",
//                "max@b@c.com",
//                "bob@a.io",
//                "anna@x.y.z",
//                ".sara@mail.com",
//                "kate.mail.com",
//                "lee@ab.cd",
//                "john.doe@server",
//                "tom@mail.com.",
//                "ann@site.org",
//                "@mail.com",
//                "first.last@my-server.com"
//        };
///   1. В email должен быть ровно один символ @ - применили методы indexOf и lastIndexOf
///   + чтобы можна было проверить весь массив добавили for.
//        for (int i = 0; i < emails.length; i++) {
//            System.out.println(emails[i].indexOf("@"));
//            System.out.println(emails[i].lastIndexOf("@"));
//        }
//    }
//}
///2. Перед @ должно быть не меньше 3 символов. Используем for и метод indexOf
///   потому что в условии указато Перед @
//
//        for (int i = 0; i < emails.length; i++) {
//            int index3 = emails[i].indexOf("@");
//            if (index3 >= 3)
//            {
//                System.out.println(emails[i]+": True");
//            }
//        }
//    }
//}
/// 3. После @ должно быть не меньше 5 символов. Используем for и метод lastIndexOf
///   потому что в условии указато После @
//        for (int i = 0; i < emails.length; i++) {
//            int index3 = emails[i].lastIndexOf("@");
//            if (index3 >= 5)
//            {
//                System.out.println(emails[i]+": True");
//            }
//        }
//    }
//}

///// 4.После @ должна быть хотя бы одна точка (.) БЫЛО СЛОЖНО.)
//    for (int i=0; i<emails.length; i++) {
//        int index = emails [i].indexOf("@");
//        if (index != -1) {
//String afterAt = emails [i].substring(index+1);
//if(afterAt.contains(".")){
//    System.out.println(emails [i] + ": True");
//}
//        }
//   }
//    }
//    }
/// 4.После @ должна быть хотя бы одна точка. Взяли метод startsWith и endsWith
/// + использовали символ ! - чтобы соблюсти условие (НЕ может)
//        for (int i = 0; i < emails.length; i++) {
//            if (!emails[i].startsWith(".") && !emails[i].endsWith(".")) {
//              System.out.println(emails[i] + ":True");
//            }
//        }
//    }
//}
/// 6. Объединить все требования. БЫЛО ООЧЕНЬ СЛОЖНО.)
//        for (int i = 0; i < emails.length; i++) {
//        String email = emails[i];
//        int firstIndex = email.indexOf("@");
//        int lastIndex = email.lastIndexOf("@");
//        if (firstIndex != -1 && firstIndex == lastIndex) {
//            if (firstIndex >= 3) {
//                String afterAt = email.substring(firstIndex + 1);
//            if (afterAt.length() >=5) {
//                if(afterAt.contains(".")){
//                    if(!email.startsWith(".") && email.endsWith(".")){
//                        System.out.println(email + ": True");
//                    }
//                }
//            }
//            }
//        }
//        }
//    }
//}