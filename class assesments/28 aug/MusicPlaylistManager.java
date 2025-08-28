import java.util.Scanner;
public class MusicPlaylistManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] songs ={"Song1", "Song2", "Song3"};
        boolean running = true;
        while(running){
            System.out.println("\n=== Music Playlist Manager ===");
            System.out.println("1. Play all songs");
            System.out.println("2. Play a song by index");
            System.out.println("3. Search for a song by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    playAllSongs(songs);
                    break;
                case 2:
                    playSongByIndex(songs, sc);
                    break;
                case 3:
                    searchSong(songs, sc);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
    private static void playAllSongs(String[] songs) {
        System.out.println("\nPlaying all songs:");
        for(int i = 0; i < songs.length; i++) {
            System.out.println("Playing: " +(i) + ": " + songs[i]);
        }
    }
    private static void searchSong(String[] songs, Scanner sc) {
        showSongs(songs);
        System.out.print("Enter the name of the song to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for(int i = 0; i < songs.length; i++) {
            if(songs[i].equalsIgnoreCase(name)) {
                System.out.println("Found: " + songs[i] + " at index " + i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Song not found!");
        }
    }
    private static void playSongByIndex(String[] songs, Scanner sc) {
        showSongs(songs);
        System.out.print("Enter the index of the song to play: ");
        int index = sc.nextInt();
        if(index >= 0 && index < songs.length) {
            System.out.println("Playing: " + songs[index]);
        } else {
            System.out.println("Invalid index! Please try again.");
        }
    }
    private static void showSongs(String[] songs) {
        System.out.println("\nAvailable songs:");
        for(int i = 0; i < songs.length; i++) {
            System.out.println(i + ": " + songs[i]);
        }
    } 
}