package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.JVMInstruction;
import st.gravel.support.compiler.jvm.JVMInstruction.JVMInstruction_Factory;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMStack;
import st.gravel.support.compiler.jvm.JVMType;

public class LabelLineNumber extends JVMInstruction implements Cloneable {

	public static LabelLineNumber_Factory factory = new LabelLineNumber_Factory();

	int _line;

	public static class LabelLineNumber_Factory extends JVMInstruction_Factory {

		public LabelLineNumber basicNew() {
			LabelLineNumber newInstance = new LabelLineNumber();
			newInstance.initialize();
			return newInstance;
		}

		public LabelLineNumber line_(final int _anInteger) {
			return this.basicNew().initializeLine_(_anInteger);
		}
	}

	static public LabelLineNumber _line_(Object receiver, final int _anInteger) {
		return factory.line_(_anInteger);
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitLabelLineNumber_(this);
	}

	public LabelLineNumber copy() {
		try {
			LabelLineNumber _temp1 = (LabelLineNumber) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		return this;
	}

	public LabelLineNumber_Factory factory() {
		return factory;
	}

	public LabelLineNumber initializeLine_(final int _anInteger) {
		_line = _anInteger;
		this.initialize();
		return this;
	}

	public int line() {
		return _line;
	}

	@Override
	public LabelLineNumber printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(st.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	@Override
	public LabelLineNumber sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public LabelLineNumber withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return LabelLineNumber.this;
		}
		throw new RuntimeException("niy");
	}
}
