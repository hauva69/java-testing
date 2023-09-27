https://stackoverflow.com/questions/8105032/how-to-retrieve-user-session-attributes-like-username

 

LoginBean user = (LoginBean) session.getAttribute("currentSessionUser");

 

if (user != null) {

    String userName = user.getUserName();

    // ...

}

 

https://docs.oracle.com/javaee/5/api/

https://docs.oracle.com/javase/7/docs/api/java/util/Enumeration.html?is-external=true

https://docs.oracle.com/javase/1.5.0/docs/api/java/util/Enumeration.html

 

java.util.Enumeration

StringTokenizer implements

 

   for (Enumeration<E> e = v.elements(); e.hasMoreElements();)

       System.out.println(e.nextElement());

