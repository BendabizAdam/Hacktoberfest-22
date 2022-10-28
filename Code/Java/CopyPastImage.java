// Importing all input output java classes
import java.io.*;
// Importing OpenCV modules
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.core.Mat;
import org.opencv.core.Core;

class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Loading OpenCV core library
		System.loadLibrary(Core.Native_Library_Name);

		// Read image from file and
		// Store it in a Matrix object
		String f = "C:/opencv/gfgarticleimg.png";

		// Creation of a Matrix object
		Mat m = Imgcodecs.imread(f);

		// Display message
		System.out.println(
			"Your Image has been Loaded.......");

		// Take another file for generating output image
		String f2 = "C:/opencv/gfgarticleimgResaved.png";

		// Write the image
		Imgcodecs.imwrite(f2, m);

		// Display message
		System.out.println(
			"congrats! your image has been saved........");
	}
}
