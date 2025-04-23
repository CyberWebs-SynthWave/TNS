public class ThreadDemo {
    
    // Thread to simulate sending an email
    static class SendEmail extends Thread {
        public void run() {
            try {
                System.out.println("📧 Preparing to send email...");
                Thread.sleep(3000); // Simulate 3-second delay
                System.out.println("✅ Email sent successfully!");
            } catch (InterruptedException e) {
                System.out.println("❌ Email sending failed.");
            }
        }
    }

    // Thread to simulate printing a screenshot
    static class PrintScreenshot extends Thread {
        public void run() {
            try {
                System.out.println("🖨️ Capturing screenshot...");
                Thread.sleep(2000); // Simulate 2-second delay
                System.out.println("🖼️ Screenshot printed successfully!");
            } catch (InterruptedException e) {
                System.out.println("❌ Screenshot printing failed.");
            }
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        SendEmail emailTask = new SendEmail();               // Create email thread
        PrintScreenshot screenshotTask = new PrintScreenshot(); // Create screenshot thread

        emailTask.start();       // Start sending email
        screenshotTask.start();  // Start printing screenshot
    }
}
