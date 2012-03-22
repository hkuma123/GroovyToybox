def dir = new File('c:/tisdev/workspace/LightXenlon/src/main/java')

dir.traverse {

   def filePattern = ~/.*\.(java)$/

   if ( !it.isDirectory() ){

       String fileName = it.getName()

       if (fileName =~ filePattern) {

           String filePath = it.getAbsolutePath()

           int num = 0;

           new File(filePath).eachLine {
               if (it.length() != 0){
                   //println it
                   num++ 
               }
           }

           print fileName + ' -------- '
           println num;

       }

   }

}
