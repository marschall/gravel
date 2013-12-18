package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.Producer;
import java.util.Map;
import org.gravel.support.compiler.ast.ClassNode;
import org.gravel.support.compiler.ast.MessageNode;
import org.gravel.support.compiler.ast.Parser;
import org.gravel.support.compiler.ast.VariableDeclarationNode;
import org.gravel.support.compiler.ast.SimpleTraitUsageNode;
import org.gravel.support.compiler.ast.Reference;
import org.gravel.support.compiler.ast.Expression;
import org.gravel.support.compiler.ast.SharedDeclarationNode;
import org.gravel.support.compiler.ast.LiteralNode;
import java.util.HashMap;
import org.gravel.support.compiler.ast.SystemDefinitionNode;
import java.util.List;
import org.gravel.support.compiler.ast.PackageNode;
import java.util.ArrayList;
import org.gravel.support.compiler.ast.SourceFile;
import org.gravel.support.compiler.ast.NamespaceNode;
import org.gravel.support.compiler.ast.AbsoluteReference;
import java.util.Map;
import java.util.Map.*;

public class DiskClassReader extends Object implements Cloneable {

	public static DiskClassReader_Factory factory = new DiskClassReader_Factory();

	Map<String, org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>> _directives;

	Producer _producer;

	java.io.File _root;

	public static class DiskClassReader_Factory extends org.gravel.support.jvm.SmalltalkFactory {

		public DiskClassReader basicNew() {
			DiskClassReader newInstance = new DiskClassReader();
			newInstance.initialize();
			return newInstance;
		}

		public DiskClassReader root_producer_(final java.io.File _aFilename, final Producer _aProducer) {
			return this.basicNew().initializeRoot_producer_(_aFilename, _aProducer);
		}
	}

	static public DiskClassReader _root_producer_(Object receiver, final java.io.File _aFilename, final Producer _aProducer) {
		return factory.root_producer_(_aFilename, _aProducer);
	}

	public ClassNode addClassInstVar_for_(final String _aString, final ClassNode _aClassNode) {
		return _aClassNode.withClassInstVar_(VariableDeclarationNode.factory.name_(_aString));
	}

	public ClassNode addClassMethod_for_(final Parser _aParser, final ClassNode _aClassNode) {
		return this.addClassMethod_protocol_for_(_aParser, "gravel", _aClassNode);
	}

	public ClassNode addClassMethod_protocol_for_(final Parser _aParser, final String _aString, final ClassNode _aClassNode) {
		_aParser.parseBang();
		return _aClassNode.withClassMethodNode_(_aParser.parseMethod().withProtocol_(_aString));
	}

	public ClassNode addInstVar_for_(final String _aString, final ClassNode _aClassNode) {
		return _aClassNode.withInstVar_(VariableDeclarationNode.factory.name_(_aString));
	}

	public ClassNode addMethod_for_(final Parser _aParser, final ClassNode _aClassNode) {
		return this.addMethod_protocol_for_(_aParser, "gravel", _aClassNode);
	}

	public ClassNode addMethod_protocol_for_(final Parser _aParser, final String _aString, final ClassNode _aClassNode) {
		_aParser.parseBang();
		return _aClassNode.withMethodNode_(_aParser.parseMethod().withProtocol_(_aString));
	}

	public ClassNode addSimpleTrait_for_(final String _referenceString, final ClassNode _aClassNode) {
		return _aClassNode.withTrait_(SimpleTraitUsageNode.factory.reference_(Reference.factory.value_(_referenceString)));
	}

	public DiskClassReader copy() {
		try {
			DiskClassReader _temp1 = (DiskClassReader) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public ClassNode defineClass_superclass_for_(final String _name, final String _superclassPath, final ClassNode _aClassNode) {
		return _aClassNode.withSuperclassPath_(_superclassPath);
	}

	public ClassNode defineSharedVariable_init_for_(final String _sharedName, final String _initializerSource, final ClassNode _aClassNode) {
		final Expression _initializer;
		_initializer = this.parseInitializerSource_(_initializerSource);
		return _aClassNode.withSharedVariable_(SharedDeclarationNode.factory.name_initializer_(_sharedName, _initializer));
	}

	public ClassNode defineTrait_superclass_for_(final String _name, final String _superclassPath, final ClassNode _aClassNode) {
		return this.defineClass_superclass_for_(_name, _superclassPath, _aClassNode).asTrait();
	}

	public org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser> directiveAt_(final String _selector) {
		org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser> _temp1 = _directives.get(_selector);
		if (_temp1 == null) {
			throw new RuntimeException("Unknown directive: " + _selector);
		}
		return ((org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>) _temp1);
	}

	public String evaluate_(final LiteralNode _aLiteralNode) {
		return ((String) _aLiteralNode.value());
	}

	public ClassNode extendClass_for_(final String _aString, final ClassNode _aClassNode) {
		return _aClassNode.beExtension();
	}

	public ClassNode extendTrait_for_(final String _aString, final ClassNode _aClassNode) {
		return this.extendClass_for_(_aString, _aClassNode).asTrait();
	}

	public DiskClassReader_Factory factory() {
		return factory;
	}

	public DiskClassReader initialize() {
		_directives = new java.util.HashMap<String, org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>>();
		_directives.put("defineClass:superclass:", new org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>() {

			@Override
			public ClassNode value_value_value_(final ClassNode _classNode, final MessageNode _expr, final Parser _parser) {
				return (ClassNode) DiskClassReader.this.defineClass_superclass_for_(DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[0]))), DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[1]))), _classNode);
			}
		});
		_directives.put("extendClass:", new org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>() {

			@Override
			public ClassNode value_value_value_(final ClassNode _classNode, final MessageNode _expr, final Parser _parser) {
				return (ClassNode) DiskClassReader.this.extendClass_for_(DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[0]))), _classNode);
			}
		});
		_directives.put("defineTrait:superclass:", new org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>() {

			@Override
			public ClassNode value_value_value_(final ClassNode _classNode, final MessageNode _expr, final Parser _parser) {
				return (ClassNode) DiskClassReader.this.defineTrait_superclass_for_(DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[0]))), DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[1]))), _classNode);
			}
		});
		_directives.put("extendTrait:", new org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>() {

			@Override
			public ClassNode value_value_value_(final ClassNode _classNode, final MessageNode _expr, final Parser _parser) {
				return (ClassNode) DiskClassReader.this.extendTrait_for_(DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[0]))), _classNode);
			}
		});
		_directives.put("addSimpleTrait:", new org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>() {

			@Override
			public ClassNode value_value_value_(final ClassNode _classNode, final MessageNode _expr, final Parser _parser) {
				return (ClassNode) DiskClassReader.this.addSimpleTrait_for_(DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[0]))), _classNode);
			}
		});
		_directives.put("addInstVar:", new org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>() {

			@Override
			public ClassNode value_value_value_(final ClassNode _classNode, final MessageNode _expr, final Parser _parser) {
				return (ClassNode) DiskClassReader.this.addInstVar_for_(DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[0]))), _classNode);
			}
		});
		_directives.put("addClassInstVar:", new org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>() {

			@Override
			public ClassNode value_value_value_(final ClassNode _classNode, final MessageNode _expr, final Parser _parser) {
				return (ClassNode) DiskClassReader.this.addClassInstVar_for_(DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[0]))), _classNode);
			}
		});
		_directives.put("propertyAt:put:", new org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>() {

			@Override
			public ClassNode value_value_value_(final ClassNode _classNode, final MessageNode _expr, final Parser _parser) {
				return (ClassNode) DiskClassReader.this.propertyAt_put_for_(DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[0]))), DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[1]))), _classNode);
			}
		});
		_directives.put("addMethod", new org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>() {

			@Override
			public ClassNode value_value_value_(final ClassNode _classNode, final MessageNode _expr, final Parser _parser) {
				return (ClassNode) DiskClassReader.this.addMethod_for_(_parser, _classNode);
			}
		});
		_directives.put("addClassMethod", new org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>() {

			@Override
			public ClassNode value_value_value_(final ClassNode _classNode, final MessageNode _expr, final Parser _parser) {
				return (ClassNode) DiskClassReader.this.addClassMethod_for_(_parser, _classNode);
			}
		});
		_directives.put("addMethod:", new org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>() {

			@Override
			public ClassNode value_value_value_(final ClassNode _classNode, final MessageNode _expr, final Parser _parser) {
				return (ClassNode) DiskClassReader.this.addMethod_protocol_for_(_parser, DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[0]))), _classNode);
			}
		});
		_directives.put("addClassMethod:", new org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>() {

			@Override
			public ClassNode value_value_value_(final ClassNode _classNode, final MessageNode _expr, final Parser _parser) {
				return (ClassNode) DiskClassReader.this.addClassMethod_protocol_for_(_parser, DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[0]))), _classNode);
			}
		});
		_directives.put("defineSharedVariable:init:", new org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser>() {

			@Override
			public ClassNode value_value_value_(final ClassNode _classNode, final MessageNode _expr, final Parser _parser) {
				return (ClassNode) DiskClassReader.this.defineSharedVariable_init_for_(DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[0]))), DiskClassReader.this.evaluate_(((LiteralNode) (_expr.arguments()[1]))), _classNode);
			}
		});
		return this;
	}

	public DiskClassReader initializeRoot_producer_(final java.io.File _aFilename, final Producer _aProducer) {
		_root = _aFilename;
		_producer = _aProducer;
		this.initialize();
		return this;
	}

	public Expression parseInitializerSource_(final String _initializerSource) {
		return _initializerSource == null ? null : Parser.factory.parseExpression_(_initializerSource);
	}

	public DiskClassReader postCopy() {
		return this;
	}

	public Producer producer() {
		return _producer;
	}

	public ClassNode propertyAt_put_for_(final String _key, final String _value, final ClassNode _aClassNode) {
		return _aClassNode.withPropertyAt_put_(_key, _value);
	}

	public SystemDefinitionNode read() {
		final List<PackageNode> _coll;
		_coll = new java.util.ArrayList();
		for (final String _packageName : _root.list()) {
			_coll.add(DiskClassReader.this.readPackage_(_packageName));
		}
		return SystemDefinitionNode.factory.packageNodes_(_coll.toArray(new PackageNode[_coll.size()]));
	}

	public PackageNode readClassesIn_packageName_namespace_(final java.io.File _fn, final org.gravel.core.Symbol _packageName, final String[] _anArray) {
		final PackageNode[] _pkg;
		_pkg = new PackageNode[1];
		_pkg[0] = PackageNode.factory.name_(_packageName);
		for (final String _sf : _fn.list()) {
			final java.io.File _subfile;
			_subfile = new java.io.File(_fn, _sf);
			if (_subfile.isDirectory()) {
				_pkg[0] = _pkg[0].withPackage_(DiskClassReader.this.readClassesIn_packageName_namespace_(_subfile, _packageName, org.gravel.support.jvm.ArrayExtensions.copyWith_(_anArray, _sf)));
			} else {
				if (_sf.endsWith(".st")) {
					_pkg[0] = _pkg[0].withClass_(DiskClassReader.this.readClass_packageName_file_namespace_(_sf.substring(0, _sf.length() - ".st".length()), _packageName, _subfile, _anArray));
				} else {
					if (org.gravel.support.jvm.StringExtensions.equals_(_sf, "properties.json")) {
						_pkg[0] = _pkg[0].withNamespace_(DiskClassReader.this.readNamespace_namespace_(_subfile, _anArray));
					}
				}
			}
		}
		return _pkg[0];
	}

	public ClassNode readClass_packageName_file_namespace_(final String _aName, final org.gravel.core.Symbol _packageName, final java.io.File _aFilename, final String[] _anArray) {
		final Parser _parser;
		MessageNode _expr;
		ClassNode _cn;
		org.gravel.support.jvm.Block3<ClassNode, ClassNode, MessageNode, Parser> _directive;
		final int _start;
		_cn = ClassNode.factory.name_namespacePath_(org.gravel.core.Symbol.value(_aName), org.gravel.support.jvm.ArrayExtensions.collect_(_anArray, ((org.gravel.support.jvm.Block1<org.gravel.core.Symbol, String>) (new org.gravel.support.jvm.Block1<org.gravel.core.Symbol, String>() {

			@Override
			public org.gravel.core.Symbol value_(final String _each) {
				return (org.gravel.core.Symbol) org.gravel.core.Symbol.value(_each);
			}
		}))));
		_parser = Parser.factory.source_sourceFile_(org.gravel.support.jvm.FilenameExtensions.contentsOfEntireFile(_aFilename), SourceFile.factory.directory_name_packageName_(_aFilename.getParent(), _aFilename.getName(), _packageName));
		_start = _parser.position();
		boolean _temp1 = false;
		while (!_temp1) {
			_temp1 = _parser.atEnd();
			if (!_temp1) {
				_expr = ((MessageNode) _parser.parseExpression());
				_directive = DiskClassReader.this.directiveAt_(_expr.selector());
				_cn = _directive.value_value_value_(_cn, _expr, _parser);
				if (!_parser.atEnd()) {
					_parser.parseBang();
				}
			}
		}
		return ((ClassNode) _parser.setSourcePosition_node_(_start, _cn));
	}

	public NamespaceNode readNamespace_namespace_(final java.io.File _aFilename, final String[] _namespaceStrings) {
		final Map<String, Object> _dict;
		final AbsoluteReference[] _publicImports;
		final AbsoluteReference[] _privateImports;
		final Object[] _publicImportStrings;
		final Object[] _privateImportStrings;
		final Map<String, String> _sharedVariableStrings;
		final List<SharedDeclarationNode> _sharedVariables;
		_dict = this.readPropertiesFile_(_aFilename);
		Object _temp1 = _dict.get("publicImports");
		if (_temp1 == null) {
			_temp1 = new Object[] {};
		}
		_publicImportStrings = ((Object[]) _temp1);
		Object _temp2 = _dict.get("privateImports");
		if (_temp2 == null) {
			_temp2 = new Object[] {};
		}
		_privateImportStrings = ((Object[]) _temp2);
		Object _temp3 = _dict.get("sharedVariables");
		if (_temp3 == null) {
			_temp3 = new java.util.HashMap<String, String>();
		}
		_sharedVariableStrings = ((Map<String, String>) _temp3);
		_publicImports = org.gravel.support.jvm.ArrayExtensions.collect_(_publicImportStrings, ((org.gravel.support.jvm.Block1<AbsoluteReference, Object>) (new org.gravel.support.jvm.Block1<AbsoluteReference, Object>() {

			@Override
			public AbsoluteReference value_(final Object _obj) {
				final String _str;
				_str = ((String) _obj);
				return (AbsoluteReference) Reference.factory.value_(_str);
			}
		})));
		_privateImports = org.gravel.support.jvm.ArrayExtensions.collect_(_privateImportStrings, ((org.gravel.support.jvm.Block1<AbsoluteReference, Object>) (new org.gravel.support.jvm.Block1<AbsoluteReference, Object>() {

			@Override
			public AbsoluteReference value_(final Object _obj) {
				final String _str;
				_str = ((String) _obj);
				return (AbsoluteReference) Reference.factory.value_(_str);
			}
		})));
		_sharedVariables = new java.util.ArrayList();
		for (final Map.Entry<String, String> _temp4 : _sharedVariableStrings.entrySet()) {
			String _name = _temp4.getKey();
			String _initializerString = _temp4.getValue();
			_sharedVariables.add(SharedDeclarationNode.factory.name_initializer_(_name, DiskClassReader.this.parseInitializerSource_(_initializerString)));
		}
		return NamespaceNode.factory.reference_publicImports_privateImports_sharedVariables_(AbsoluteReference.factory.path_(org.gravel.support.jvm.ArrayExtensions.collect_(_namespaceStrings, ((org.gravel.support.jvm.Block1<org.gravel.core.Symbol, String>) (new org.gravel.support.jvm.Block1<org.gravel.core.Symbol, String>() {

			@Override
			public org.gravel.core.Symbol value_(final String _each) {
				return (org.gravel.core.Symbol) org.gravel.core.Symbol.value(_each);
			}
		})))), _publicImports, _privateImports, _sharedVariables.toArray(new SharedDeclarationNode[_sharedVariables.size()]));
	}

	public PackageNode readPackage_(final String _aString) {
		return this.readClassesIn_packageName_namespace_(new java.io.File(_root, _aString), org.gravel.core.Symbol.value(_aString), new String[] {});
	}

	public Map<String, Object> readPropertiesFile_(final java.io.File _aFilename) {
		if (!_aFilename.exists()) {
			return new java.util.HashMap<String, Object>();
		}
		return org.gravel.support.jvm.StringExtensions.parseAsJSONValue(org.gravel.support.jvm.FilenameExtensions.contentsOfEntireFile(_aFilename));
	}

	public java.io.File root() {
		return _root;
	}
}
