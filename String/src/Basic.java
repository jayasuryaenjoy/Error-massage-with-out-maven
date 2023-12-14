import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Basic {

	public static void main(String[] args) {
		System.out.println("132456");

		String inputString = "YourString04092MoreText";

		Pattern pattern = Pattern.compile("04092");
		Matcher matcher = pattern.matcher(inputString);
		while (matcher.find()) {
			String extractedValue = matcher.group();
			System.out.println("Extracted Value: " + extractedValue);
		}

		String jsonResponse = "{ \"data\": \"NO_RATING_POSSIBLE\" }";
		int httpStatusCode = 400;

		if (httpStatusCode == 404) {
			try {
				// Remove leading and trailing curly braces
				String jsonString = jsonResponse.substring(1, jsonResponse.length() - 1);

				// Split the key-value pair
				String[] keyValue = jsonString.split(":");
				if (keyValue.length == 2) {
					String key = keyValue[0].trim();
					String value = keyValue[1].trim();

					if ("\"data\"".equals(key)) {
						// Remove leading and trailing double quotes
						String quoteStatus = value.substring(1, value.length() - 1);
						System.out.println("Quote Status: " + quoteStatus);
					}
				}
			} catch (Exception e) {
				System.out.println("Error parsing JSON response: " + e.getMessage());
			}
		} else {
			if (httpStatusCode == 400) {
				try {
					// Remove leading and trailing curly braces
					String jsonString = jsonResponse.substring(1, jsonResponse.length() - 1);

					// Split the key-value pair
					String[] keyValue = jsonString.split(":");
					if (keyValue.length == 2) {
						String key = keyValue[0].trim();
						String value = keyValue[1].trim();

						if ("\"data\"".equals(key)) {
							// Remove leading and trailing double quotes
							String quoteStatus = value.substring(1, value.length() - 1);
							System.out.println("Quote Status: " + quoteStatus);
						}
					}
				} catch (Exception e) {
					System.out.println("Error parsing JSON response: " + e.getMessage());
				}
			}
		}
	}

}
