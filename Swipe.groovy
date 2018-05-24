@Keyword
def swipeDirection(String direction){
	JavascriptExecutor js = (JavascriptExecutor) getCurrentSessionMobileDriver()
	HashMap<String, String> scrollObject = new HashMap<String, String>()
	scrollObject.put(“direction”, direction)
	js.executeScript(“mobile: swipe”, scrollObject)
}