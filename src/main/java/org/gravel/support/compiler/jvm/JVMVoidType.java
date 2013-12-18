package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.JVMType;
import org.gravel.support.compiler.jvm.JVMType.JVMType_Factory;
import org.gravel.support.compiler.jvm.JVMNodeVisitor;
import org.gravel.support.compiler.jvm.CastTo;

public class JVMVoidType extends JVMType implements Cloneable {

	public static JVMVoidType_Factory factory = new JVMVoidType_Factory();

	public static class JVMVoidType_Factory extends JVMType_Factory {

		public JVMVoidType basicNew() {
			JVMVoidType newInstance = new JVMVoidType();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMNodeVisitor<X> _visitor) {
		return _visitor.visitJVMVoidType_(this);
	}

	@Override
	public JVMType commonSuperTypeWith_(final JVMType _aJVMType) {
		return _aJVMType;
	}

	public JVMVoidType copy() {
		try {
			JVMVoidType _temp1 = (JVMVoidType) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMVoidType descriptorOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	public JVMVoidType_Factory factory() {
		return factory;
	}

	@Override
	public boolean isVoidType() {
		return true;
	}

	@Override
	public CastTo newCastInstructionTo_(final JVMType _aJVMType) {
		return this.castNotSupported();
	}

	@Override
	public JVMVoidType printOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	@Override
	public JVMVoidType sourceOn_(final StringBuilder _aStream) {
		_aStream.append('V');
		return this;
	}
}
