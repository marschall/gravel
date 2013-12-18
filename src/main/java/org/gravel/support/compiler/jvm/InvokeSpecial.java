package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.Invoke;
import org.gravel.support.compiler.jvm.Invoke.Invoke_Factory;
import org.gravel.support.compiler.jvm.JVMDefinedObjectType;
import org.gravel.support.compiler.jvm.JVMMethodType;
import org.gravel.support.compiler.jvm.JVMType;
import org.gravel.support.compiler.jvm.JVMInstructionVisitor;
import org.gravel.support.compiler.jvm.JVMStack;
import org.gravel.support.compiler.jvm.JVMInstruction;
import org.gravel.support.compiler.jvm.JVMBottomType;

public class InvokeSpecial extends Invoke implements Cloneable {

	public static InvokeSpecial_Factory factory = new InvokeSpecial_Factory();

	public static class InvokeSpecial_Factory extends Invoke_Factory {

		public InvokeSpecial basicNew() {
			InvokeSpecial newInstance = new InvokeSpecial();
			newInstance.initialize();
			return newInstance;
		}

		public InvokeSpecial init_signature_(final JVMDefinedObjectType _aJVMDefinedObjectType, final JVMMethodType _aJVMMethodType) {
			return this.ownerType_name_signature_(_aJVMDefinedObjectType, "<init>", _aJVMMethodType);
		}

		public InvokeSpecial init_voidArguments_(final JVMDefinedObjectType _aJVMDefinedObjectType, final JVMType[] _anArray) {
			return this.init_signature_(_aJVMDefinedObjectType, JVMMethodType.factory.voidArguments_(_anArray));
		}

		@Override
		public InvokeSpecial ownerType_name_signature_(final JVMDefinedObjectType _aJVMDefinedObjectType, final String _aString, final JVMMethodType _aJVMMethodType) {
			return ((InvokeSpecial) this.basicNew().initializeOwnerType_name_signature_(_aJVMDefinedObjectType, _aString, _aJVMMethodType));
		}
	}

	static public InvokeSpecial _init_signature_(Object receiver, final JVMDefinedObjectType _aJVMDefinedObjectType, final JVMMethodType _aJVMMethodType) {
		return factory.init_signature_(_aJVMDefinedObjectType, _aJVMMethodType);
	}

	static public InvokeSpecial _init_voidArguments_(Object receiver, final JVMDefinedObjectType _aJVMDefinedObjectType, final JVMType[] _anArray) {
		return factory.init_voidArguments_(_aJVMDefinedObjectType, _anArray);
	}

	static public InvokeSpecial _ownerType_name_signature_(Object receiver, final JVMDefinedObjectType _aJVMDefinedObjectType, final String _aString, final JVMMethodType _aJVMMethodType) {
		return factory.ownerType_name_signature_(_aJVMDefinedObjectType, _aString, _aJVMMethodType);
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitInvokeSpecial_(this);
	}

	public InvokeSpecial copy() {
		try {
			InvokeSpecial _temp1 = (InvokeSpecial) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		for (int _temp1 = 0; _temp1 < _signature.arguments().length; _temp1++) {
			final JVMType _each = _signature.arguments()[(_signature.arguments().length - _temp1) - 1];
			org.gravel.support.jvm.ObjectExtensions.assert_(InvokeSpecial.this, org.gravel.support.jvm.ObjectExtensions.equals_(_aJVMStack.pop(), _each));
		}
		_aJVMStack.pop();
		if (!_signature.returnType().isVoidType()) {
			_aJVMStack.push_(_signature.returnType());
		}
		return this;
	}

	public InvokeSpecial_Factory factory() {
		return factory;
	}

	@Override
	public InvokeSpecial initializeOwnerType_name_signature_(final JVMDefinedObjectType _aJVMDefinedObjectType, final String _aString, final JVMMethodType _aJVMMethodType) {
		_ownerType = _aJVMDefinedObjectType;
		_name = _aString;
		_signature = _aJVMMethodType;
		this.initialize();
		return this;
	}

	@Override
	public InvokeSpecial printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(org.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	@Override
	public InvokeSpecial sourceOn_(final StringBuilder _aStream) {
		_aStream.append("name: ");
		_aStream.append(_name);
		_aStream.append("ownerType: ");
		_aStream.append(_ownerType.toString());
		_aStream.append("signature: ");
		_aStream.append(_signature.toString());
		return this;
	}

	@Override
	public JVMType type() {
		return JVMBottomType.factory.basicNew();
	}

	@Override
	public InvokeSpecial withReturnType_(final JVMType _aType) {
		if (org.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return InvokeSpecial.this;
		}
		throw new RuntimeException("niy");
	}
}
