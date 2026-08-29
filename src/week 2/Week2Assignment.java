
import java.util.*;

public class Week2Assignment {

    // Problem 1: ATM PIN Length Validator
    public static void checkPinLength(String pin) {
        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    // Problem 2: Word Reversal Encoder
    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder(words[i]);
            result.append(reversedWord.reverse());

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    // Problem 3: Product Inventory CSV Parser
    public static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println(
                    "Product: " + fields[0] +
                    " | SKU: " + fields[1] +
                    " | Qty: " + fields[2]
            );
        }
    }

    // Problem 4: Library ISBN Normalizer & Validator
    public static String normalizeCode(String raw) {
        String code = raw.trim();

        if (code.length() >= 3) {
            String publisher = code.substring(0, 3).toUpperCase();
            return publisher + code.substring(3);
        }

        return code.toUpperCase();
    }

    public static String validateAndFormat(String code) {

        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        StringBuilder result = new StringBuilder();
        result.append("[")
              .append(code.substring(0, 3))
              .append("] YEAR: ")
              .append(code.substring(3, 7))
              .append(" | CATALOG: ")
              .append(code.substring(7));

        return result.toString();
    }

    // Problem 5: Stop-Word-Filtered Word Frequency Report
    public static void printFilteredWordFrequency(String feedback) {

        String cleanedText = feedback
                .toLowerCase()
                .replace(".", "")
                .replace(",", "");

        String[] words = cleanedText.split("\\s+");

        Set<String> stopWords = new HashSet<>(
                Arrays.asList("the", "was", "and", "a", "is", "of", "in")
        );

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (!stopWords.contains(word)) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> entries =
                new ArrayList<>(frequency.entrySet());

        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        // Problem 1
        System.out.println("Problem 1:");
        checkPinLength("482");
        checkPinLength("4820");

        // Problem 2
        System.out.println("\nProblem 2:");
        System.out.println(reverseEachWord("hello club"));

        // Problem 3
        System.out.println("\nProblem 3:");
        parseInventoryRecord("Wireless Mouse,WM-2201,150");
        parseInventoryRecord("Wireless Mouse,150");

        // Problem 4
        System.out.println("\nProblem 4:");
        String code = normalizeCode(" pen2026004251 ");
        System.out.println(validateAndFormat(code));

        System.out.println(validateAndFormat(
                normalizeCode("12N2026004251")
        ));

        // Problem 5
        System.out.println("\nProblem 5:");
        printFilteredWordFrequency(
                "The mentor was great, the session was great and clear."
        );
    }
}
Step 3 — Run it
Right-click inside Week2Assignment.java and select:

Run Week2Assignment.main()

You should get output for Problem 1 through Problem 5.

Once it runs successfully, don't push yet. Send me a screenshot of the output, and I'll check it against the assignment requirements before we commit it.


give me all this code in a word docx I will direclty download and paste it in the week 2 folder

Done. I put all 5 Week 2 problems in sequence into a Word document, using Arial font.

Download Week 2 Assignment Code (.docx)

You can open it, copy the code, and paste it into your week2 folder. The code follows the problems in your assignment PDF. 


Important: save the pasted file as:

Week2Assignment.java
Then I'll help you run it → commit → push directly to feature/session_2. 


Week2Assignment_Code.docx
Document


next

Great. Now let's get the code into feature/session_2.

Step 1 — Open the downloaded .docx
Open:

Week2Assignment_Code.docx

Copy all the Java code from it.

Step 2 — Create the Java file in Antigravity
In the left Explorer:

Right-click your week2 folder.

Choose New File.

Name it exactly:

Week2Assignment.java
Paste the code into that file.

Press Ctrl + S.

Step 3 — Run it
In the terminal, run:

javac Week2Assignment.java
If your file is inside src/week2, first make sure your terminal is in that folder, or run it from the project root with the appropriate path.

If compilation succeeds, run:

java Week2Assignment
Step 4 — Check before pushing
You should see output for:

Problem 1
Problem 2
Problem 3
Problem 4
Problem 5
Don't commit or push yet.

Send me a screenshot of your Antigravity after you've pasted the code, and I'll check that the file is in the right place and tell you the exact command to run next.


eac65d12-c5d1-407e-bea8-21dcd8a45bff.png
where to click

3564849e-8ae7-4ba4-b33b-4b6fcc794ecd.png
I don't see

01054dd2-d58f-49c3-a888-7de2ed5f5dce.png

2e319977-b5ab-46d7-a402-7040d1d3bb15.png
next

a03c7705-4edd-4a04-87a1-d9f617e9ef46.png

Yes — I can see it. 👍

You are already in the correct place:

src → week2 → Week2Assignment.java

Next step
Double-click Week2Assignment.java on the left.

It is the file directly under the week2 folder, where you can see:

Week2Assignment.java

Once it opens in the middle editor, send me a screenshot.

Then I’ll tell you exactly what to paste there and what to do next.


2b5e3d76-6f0e-4ce1-83bb-2779eaedbcb5.png

I see the problem. Stop here — don't run this file. 👍

Your screenshot shows:

Week2Assignment.java.docx

and the editor is displaying strange symbols because a Word .docx file is being opened as Java code.

Do this now
In the left Explorer, right-click Week2Assignment.java.docx.

Choose Delete.

Confirm deletion.

Then:

Right-click the week2 folder.

Choose New File.

Name it exactly:

Week2Assignment.java
⚠️ Make sure it ends in .java, NOT .docx.

Press Enter.

A normal blank Java editor should open.

Do not paste the Word document into it.

Once the blank Week2Assignment.java file is open, send me a screenshot. I'll give you the exact code to paste and then the Git commands to commit and push it to feature/session_2.


cb7e90fe-ee22-4ed9-941a-d6ad3949b4de.png

Perfect. ✅ You now have the correct file:

src → week2 → Week2Assignment.java

The editor is blank, and the bottom-right says Java, so everything is correct.

Next step — paste the code
Before I give you the code, I need the Week 2 assignment requirements/code from the earlier conversation or document. I don't have that actual assignment content in the messages visible to me right now.

Send me either:

the Week 2 assignment PDF/document, or

a screenshot of the assignment questions.

Then I'll give you the complete Week2Assignment.java code, ready to copy-paste, and we'll run it and push it to feature/session_2.


Library
/
Week2Assignment_Code.docx

75%


import java.util.*;

public class Week2Assignment {

    // Problem 1: ATM PIN Length Validator
    public static void checkPinLength(String pin) {
        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    // Problem 2: Word Reversal Encoder
    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder(words[i]);
            result.append(reversedWord.reverse());

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    // Problem 3: Product Inventory CSV Parser
    public static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println(
                    "Product: " + fields[0] +
                    " | SKU: " + fields[1] +
                    " | Qty: " + fields[2]
            );
        }
    }

    // Problem 4: Library ISBN Normalizer & Validator
    public static String normalizeCode(String raw) {
        String code = raw.trim();

        if (code.length() >= 3) {
            String publisher = code.substring(0, 3).toUpperCase();
            return publisher + code.substring(3);
        }

        return code.toUpperCase();
    }

    public static String validateAndFormat(String code) {

        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        StringBuilder result = new StringBuilder();
        result.append("[")
              .append(code.substring(0, 3))
              .append("] YEAR: ")
              .append(code.substring(3, 7))
              .append(" | CATALOG: ")
              .append(code.substring(7));

        return result.toString();
    }

    // Problem 5: Stop-Word-Filtered Word Frequency Report
    public static void printFilteredWordFrequency(String feedback) {

        String cleanedText = feedback
                .toLowerCase()
                .replace(".", "")
                .replace(",", "");

        String[] words = cleanedText.split("\\s+");

        Set<String> stopWords = new HashSet<>(
                Arrays.asList("the", "was", "and", "a", "is", "of", "in")
        );

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (!stopWords.contains(word)) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> entries =
                new ArrayList<>(frequency.entrySet());

        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        // Problem 1
        System.out.println("Problem 1:");
        checkPinLength("482");
        checkPinLength("4820");

        // Problem 2
        System.out.println("\nProblem 2:");
        System.out.println(reverseEachWord("hello club"));

        // Problem 3
        System.out.println("\nProblem 3:");
        parseInventoryRecord("Wireless Mouse,WM-2201,150");
        parseInventoryRecord("Wireless Mouse,150");

        // Problem 4
        System.out.println("\nProblem 4:");
        String code = normalizeCode(" pen2026004251 ");
        System.out.println(validateAndFormat(code));

        System.out.println(validateAndFormat(
                normalizeCode("12N2026004251")
        ));

        // Problem 5
        System.out.println("\nProblem 5:");
        printFilteredWordFrequency(
                "The mentor was great, the session was great and clear."
        );
    }
}

