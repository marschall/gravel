package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.CastTo;
import st.gravel.support.compiler.jvm.CastTo.CastTo_Factory;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMStack;
import st.gravel.support.compiler.jvm.JVMInstruction;
import st.gravel.support.compiler.jvm.JVMType;
import st.gravel.support.compiler.jvm.JVMDynamicObjectType;

public class CastLongToObject extends CastTo implements Cloneable {

	public static CastLongToObject_Factory factory = new CastLongToObject_Factory();

	public static class CastLongToObject_Factory extends CastTo_Factory {

		public CastLongToObject basicNew() {
			CastLongToObject newInstance = new CastLongToObject();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitCastLongToObject_(this);
	}

	public CastLongToObject copy() {
		try {
			CastLongToObject _temp1 = (CastLongToObject) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		st.gravel.support.jvm.ObjectExtensions.assert_(this, _aJVMStack.popWide().isLongType());
		_aJVMStack.push_(this.type());
		return this;
	}

	public CastLongToObject_Factory factory() {
		return factory;
	}

	@Override
	public CastLongToObject printOn_(final StringBuilder _aStream) {
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
	public CastLongToObject sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public JVMType type() {
		return JVMDynamicObjectType.factory.basicNew();
	}

	@Override
	public CastLongToObject withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return CastLongToObject.this;
		}
		throw new RuntimeException("niy");
	}
}
