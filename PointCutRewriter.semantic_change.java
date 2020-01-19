// Write out with cheapest on left
Iterator iter = nodes.iterator();
Pointcut result = (Pointcut) iter.next();
while (iter.hasNext()) {

	result = new AndPointcut(result, right);
