def dir = new File('c:/tisdev/workspace/sample/src/main/java')

dir.traverse {

   def filePattern = ~/.*\.(java)$/

   if ( !it.isDirectory() ){

       String fileName = it.getName()

       if (fileName =~ filePattern) {

           String filePath = it.getAbsolutePath()

           int num = 0;

           new File(filePath).eachLine {
               //println it
               num++ 
           }

           print fileName + ' -------- '
           println num;

       }

   }

}
