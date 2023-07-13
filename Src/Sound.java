public class Sound {

        public static void main(String[] args) {

            MusicStyles[] musicStyles = {new PopMusic(), new RockMusic(), new ClassicMusic()};

            for (MusicStyles style : musicStyles) {

                style.playMusic();

            }

        }
        System.out.println("Playing music...");

    }



