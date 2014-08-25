import static ratpack.groovy.Groovy.*

import ratpack.form.Form;
import ratpack.form.UploadedFile;


ratpack{

      handlers{

      get(){
         render groovyTemplate("fileUploader.html")
}

      post("uploadf"){
            Form form = parse Form

            UploadedFile myfile = form.file("myFile")

            render groovyTemplate("table.html",content:myfile.text)
        }
 assets "public"


}

	

}
