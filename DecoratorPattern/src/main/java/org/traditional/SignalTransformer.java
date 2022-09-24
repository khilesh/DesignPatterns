package org.traditional;

public abstract class SignalTransformer {

/*** Attributes **/
private SignalTransformer next;

/*** Constructors ***/
public SignalTransformer() { // Initializes the "next" reference to default null
}

public SignalTransformer(SignalTransformer nextTransformer) {
	next = nextTransformer; // Initializes the "next" reference to nextTransformer
}

/*** Behaviour: If the next reference refers to a next transformer, the given signal is transformed using that instance.
If not, the given signal is returned. ***/
public Signal transform(Signal signal) {
	
	if (next != null) {
		return next.transform(signal);
	}
	return signal;
}
}
