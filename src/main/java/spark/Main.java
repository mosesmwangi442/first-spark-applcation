package spark;
import static spark.Spark.*;

    public class Main {
        public static void main(String[] args) {
            staticFileLocation("/public");
            get("/", (request, response) ->
                    "<!DOCTYPE html>" +
                            "<html>" +
                            "<head>" +
                            "<title>Hello Section Engineering!</title>" +
                            "<link rel='stylesheet' + href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
                            "</head>" +
                            "<body>" +
                            "<h1>Hello Section Engineering!</h1>" +
                            "<p>Dear Friend,</p>" +
                            "<p>How are you? I hope that you are having a nice weekend. I'm vacationing in Nyeri while I learn programming! </p>" +
                            "<p>Friend, you would not believe how cold it is here. I should have gone to Kenya instead.</p>" +
                            "<p>But I like programming a lot, so I've got that going for me. </p>" +

                            "<p><a href='/favorite_photos' >Check out my favorite photos here.</a></p>" +

                            "<p>Looking forward to seeing you soon. I'll bring you back a surprise. </p>" +
                            "<p>Cheers,</p>" +
                            "<p>Travel Enthusiast Moses</p>" +
                            "</body>" +
                            "</html>"
            );

            get("/favorite_photos", (request, response) ->
                    "<!DOCTYPE html>" +
                            "<html>" +
                            "<head>" +
                            "<title>Hello Friend!</title>" +
                            "<link rel='stylesheet'  href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
                            "</head>" +
                            "<body>" +
                            "<h1>My Photos</h1>" +
                            "<ul>" +
                            "<li><img src='/images/image1.jpg' alt='A photo of a Golden Retriever.'/></li>" +
                            "<li><img src='/images/image2.jpg' alt='A photo of a white dog.'/></li>" +
                            "</ul>" +
                            "</body>" +
                            "</html>"
            );
        }
    }
