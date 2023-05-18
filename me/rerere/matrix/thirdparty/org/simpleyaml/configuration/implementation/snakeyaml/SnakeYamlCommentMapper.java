package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.KeyTree;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.YamlCommentMapper;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.YamlCommentParser;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format.YamlCommentFormatterConfiguration;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file.YamlConfigurationOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments.CommentLine;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.MappingNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.SequenceNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;

public class SnakeYamlCommentMapper extends YamlCommentMapper {
  public boolean headerParsed = false;
  
  public KeyTree.Node currentNode;
  
  public String sideCommentPrefix;
  
  public void trackSideComment(KeyTree.Node paramNode, List paramList) {
    try {
      if (paramNode != null)
        try {
          if (paramList != null && !paramList.isEmpty()) {
            String str1 = null;
            if (paramList.size() > 1) {
              String str = StringUtils.indentation(paramNode.getIndentation());
              str1 = str + "#";
            } 
            String str2 = getComment(paramList, this.sideCommentPrefix, str1);
            try {
              if (str2 != null)
                setRawComment(paramNode, str2, CommentType.SIDE); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public KeyTree.Node track(KeyTree.Node paramNode, int paramInt, String paramString) {
    if (paramNode == null)
      paramNode = this.keyTree.findParent(paramInt); 
    this.currentNode = paramNode.add(paramInt, paramString);
    return this.currentNode;
  }
  
  public SnakeYamlCommentMapper(YamlConfigurationOptions paramYamlConfigurationOptions) {
    super(paramYamlConfigurationOptions);
    setCommentPrefix(paramYamlConfigurationOptions);
  }
  
  public KeyTree.Node trackElement(KeyTree.Node paramNode, String paramString, Node paramNode1, int paramInt) {
    KeyTree.Node node = track(paramNode, paramString, paramNode1, (Node)null);
    try {
      if (paramInt >= 0)
        node.setElementIndex(paramInt); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return node;
  }
  
  public void trackFooter(MappingNode paramMappingNode) {
    if (paramMappingNode != null) {
      List list = paramMappingNode.getEndComments();
      try {
        if (list != null && !list.isEmpty()) {
          String str1 = "#";
          String str2 = getComment(list, "#", "#");
          if (str2 != null) {
            KeyTree.Node node = track(getKeyTree().getRoot(), 0, (String)null);
            try {
              if (node != null)
                node.setComment(str2); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public KeyTree.Node getPriorityNode(String paramString) {
    return super.getPriorityNode(paramString);
  }
  
  public KeyTree.Node track(KeyTree.Node paramNode, String paramString, Node paramNode1, Node paramNode2) {
    int i = paramNode1.getStartMark().getColumn();
    KeyTree.Node node = track(paramNode, i, paramString);
    try {
      trackBlockComment(node, paramNode1.getBlockComments());
      trackSideComment(node, getSideCommentNode(paramNode1, paramNode2).getInLineComments());
      if (paramNode2 instanceof SequenceNode)
        node.isList(((SequenceNode)paramNode2).getValue().size()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return node;
  }
  
  public List getCommentLines(String paramString, CommentType paramCommentType) {
    try {
      if (paramString == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ArrayList<CommentLine> arrayList = new ArrayList();
    String[] arrayOfString = StringUtils.lines(paramString, false);
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str = StringUtils.stripIndentation(arrayOfString[b]);
      boolean bool = str.isEmpty();
      if (str.startsWith("#")) {
        str = str.substring(1);
      } else {
        try {
          if (bool) {
            try {
              if (b == 0)
                try {
                  if (paramCommentType == CommentType.IN_LINE)
                    continue; 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            str = "\n";
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
      CommentType commentType = paramCommentType;
      if (bool) {
        commentType = CommentType.BLANK_LINE;
      } else {
        try {
          if (b > 0 && paramCommentType == CommentType.IN_LINE)
            commentType = CommentType.BLOCK; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
      arrayList.add(new CommentLine(null, null, str, commentType));
      continue;
    } 
    return arrayList;
  }
  
  public void trackBlockComment(KeyTree.Node paramNode, List paramList) {
    try {
      if (paramNode != null)
        try {
          if (paramList != null && !paramList.isEmpty()) {
            String str1 = StringUtils.indentation(paramNode.getIndentation());
            String str2 = str1 + "#";
            String str3 = getComment(paramList, str2, str2);
            try {
              if (str3 != null) {
                if (!this.headerParsed) {
                  str3 = YamlCommentParser.removeHeader(str3, options());
                  this.headerParsed = true;
                } 
                setRawComment(paramNode, str3, CommentType.BLOCK);
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public String getComment(List paramList, String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<CommentLine> iterator = paramList.iterator();
    boolean bool = iterator.hasNext();
    if (bool) {
      CommentLine commentLine = iterator.next();
      bool = iterator.hasNext();
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      boolean bool1 = !bool ? true : false;
      appendLine(stringBuilder, paramString1, commentLine, bool1);
      while (bool) {
        commentLine = iterator.next();
        bool = iterator.hasNext();
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        bool1 = !bool ? true : false;
        appendLine(stringBuilder, paramString2, commentLine, bool1);
      } 
    } 
    return stringBuilder.toString();
  }
  
  public void setCommentPrefix(YamlConfigurationOptions paramYamlConfigurationOptions) {
    YamlCommentFormatterConfiguration yamlCommentFormatterConfiguration = paramYamlConfigurationOptions.commentFormatter().formatterConfiguration(CommentType.SIDE);
    try {
      this.sideCommentPrefix = yamlCommentFormatterConfiguration.prefixFirst("#");
      if (this.sideCommentPrefix.endsWith(" "))
        this.sideCommentPrefix = this.sideCommentPrefix.substring(0, this.sideCommentPrefix.length() - 1); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void appendLine(StringBuilder paramStringBuilder, String paramString, CommentLine paramCommentLine, boolean paramBoolean) {
    try {
      if (paramCommentLine.getCommentType() != CommentType.BLANK_LINE)
        paramStringBuilder.append(paramString).append(paramCommentLine.getValue()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!paramBoolean)
        paramStringBuilder.append('\n'); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void setFooter(MappingNode paramMappingNode) {
    if (paramMappingNode != null) {
      KeyTree.Node node = getNode(null);
      try {
        if (node != null)
          paramMappingNode.setEndComments(getCommentLines(node.getComment(), CommentType.BLOCK)); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public Node getSideCommentNode(Node paramNode1, Node paramNode2) {
    Node node = paramNode1;
    if (paramNode2 instanceof ScalarNode) {
      DumperOptions.ScalarStyle scalarStyle = ((ScalarNode)paramNode2).getScalarStyle();
      try {
        if (scalarStyle != DumperOptions.ScalarStyle.LITERAL && scalarStyle != DumperOptions.ScalarStyle.FOLDED)
          node = paramNode2; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } else {
      try {
        if (paramNode2 != null && !(paramNode2 instanceof me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.CollectionNode))
          node = paramNode2; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return node;
  }
  
  public void setComments(KeyTree.Node paramNode, Node paramNode1, Node paramNode2) {
    try {
      if (paramNode != null) {
        paramNode1.setBlockComments(getCommentLines(paramNode.getComment(), CommentType.BLOCK));
        getSideCommentNode(paramNode1, paramNode2).setInLineComments(getCommentLines(paramNode.getSideComment(), CommentType.IN_LINE));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void clearCurrentNodeIfNoComments() {
    clearNodeIfNoComments(this.currentNode);
    this.currentNode = null;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\SnakeYamlCommentMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */