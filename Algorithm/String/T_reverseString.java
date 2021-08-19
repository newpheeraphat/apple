public static String nameShuffle(String s) {
      String[] arr = s.split(" ");
			List<String> list = Arrays.asList(arr);
			Collections.reverse(list);
			String result = "".join(" ", list);
			return result;
    }
