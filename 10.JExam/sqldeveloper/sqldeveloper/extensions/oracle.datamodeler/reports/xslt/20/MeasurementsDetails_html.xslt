<?xml version="1.0" encoding="UTF-8"?><!--Designed and generated by Altova StyleVision Enterprise Edition 2014 (x64) - see http://www.altova.com/stylevision for more information.--><xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:altova="http://www.altova.com" xmlns:altovaext="http://www.altova.com/xslt-extensions" xmlns:clitype="clitype" xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:iso4217="http://www.xbrl.org/2003/iso4217" xmlns:ix="http://www.xbrl.org/2008/inlineXBRL" xmlns:java="java" xmlns:link="http://www.xbrl.org/2003/linkbase" xmlns:n1="http://oracle.com/datamodeler/reports/measurements" xmlns:sps="http://www.altova.com/StyleVision/user-xpath-functions" xmlns:xbrldi="http://xbrl.org/2006/xbrldi" xmlns:xbrli="http://www.xbrl.org/2003/instance" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" exclude-result-prefixes="#all">	<xsl:output version="4.0" method="html" indent="no" encoding="UTF-8" use-character-maps="spaces" doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN" doctype-system="http://www.w3.org/TR/html4/loose.dtd"/>	<xsl:character-map name="spaces">		<xsl:output-character character="&#160;" string="&amp;nbsp;"/>	</xsl:character-map>	<xsl:param name="altova:bGeneratingFromPxf" select="false()"/>	<xsl:param name="SV_OutputFormat" select="'HTML'"/>	<xsl:param name="SV_BaseOutputFileName" as="xs:string?">		<xsl:sequence select="for $i in altovaext:get-base-output-uri(), $j in tokenize( $i, &apos;[/\\]&apos; )[last()] return replace( $j, &apos;\.[^\.\s#%;]*$&apos;, &apos;&apos; )" use-when="function-available(&apos;altovaext:get-base-output-uri&apos;)"/>	</xsl:param>	<xsl:param name="SV_GeneratedFileNamePrefix" select="if ( $SV_BaseOutputFileName ) then $SV_BaseOutputFileName else &apos;MeasurementsDetails&apos;" as="xs:string?"/>	<xsl:param name="p1"/>	<xsl:param name="p2"/>	<xsl:variable name="XML" select="/"/>	<xsl:variable name="altova:nPxPerIn" select="96"/>	<xsl:variable name="altova:CssImages" select="()"/>	<xsl:template match="/">		<xsl:call-template name="altova:Root"/>	</xsl:template>	<xsl:template name="altova:Root">		<html>			<head>				<title/>				<meta name="generator" content="Altova StyleVision Enterprise Edition 2014 (x64) (http://www.altova.com)"/>				<meta http-equiv="X-UA-Compatible" content="IE=7"/>                <xsl:value-of select="normalize-space(concat('&lt;link rel=&quot;stylesheet&quot; type=&quot;text/css&quot; href=&quot;', $p1, '&quot;>'))" disable-output-escaping="yes"/>                <xsl:value-of select="normalize-space(concat('&lt;link rel=&quot;stylesheet&quot; type=&quot;text/css&quot; href=&quot;', $p2, '&quot;>'))" disable-output-escaping="yes"/>				<xsl:comment>[if IE]&gt;&lt;STYLE type=&quot;text/css&quot;&gt;.altova-rotate-left-textbox{filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=3)} .altova-rotate-right-textbox{filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=1)} &lt;/STYLE&gt;&lt;![endif]</xsl:comment>				<xsl:comment>[if !IE]&gt;&lt;!</xsl:comment>				<style type="text/css">.altova-rotate-left-textbox{-webkit-transform: rotate(-90deg) translate(-100%, 0%); -webkit-transform-origin: 0% 0%;-moz-transform: rotate(-90deg) translate(-100%, 0%); -moz-transform-origin: 0% 0%;-ms-transform: rotate(-90deg) translate(-100%, 0%); -ms-transform-origin: 0% 0%;}.altova-rotate-right-textbox{-webkit-transform: rotate(90deg) translate(0%, -100%); -webkit-transform-origin: 0% 0%;-moz-transform: rotate(90deg) translate(0%, -100%); -moz-transform-origin: 0% 0%;-ms-transform: rotate(90deg) translate(0%, -100%); -ms-transform-origin: 0% 0%;}</style>				<xsl:comment>&lt;![endif]</xsl:comment>				<style type="text/css">@page { margin-left:2cm; margin-right:2cm; margin-top:2cm; margin-bottom:2cm } @media print { br.altova-page-break { page-break-before: always; } }</style>			</head>			<body style="font-family:Tahoma; font-size:xx-small; ">				<xsl:for-each select="$XML">					<xsl:for-each select="n1:Measurements">						<center>							<xsl:for-each select="n1:ReportCaption">								<span class="caption">									<xsl:apply-templates/>								</span>							</xsl:for-each>						</center>						<p/>						<xsl:variable name="altova:table">							<table class="w_20">								<xsl:variable name="altova:CurrContextGrid_0" select="."/>								<xsl:variable name="altova:ColumnData"/>								<tbody>									<tr>										<td class="td_h_v w_4">											<span>												<xsl:text>Design Name</xsl:text>											</span>										</td>										<td class="td w_16">											<xsl:for-each select="n1:DesignName">												<xsl:apply-templates/>											</xsl:for-each>										</td>									</tr>									<tr>										<td class="td_h_v">											<span>												<xsl:text>Version Date</xsl:text>											</span>										</td>										<td class="td">											<xsl:for-each select="n1:VersionDate">												<xsl:apply-templates/>											</xsl:for-each>										</td>									</tr>									<tr>										<td class="td_h_v">											<span>												<xsl:text>Version Comment</xsl:text>											</span>										</td>										<td class="td">											<xsl:for-each select="n1:VersionComment">												<xsl:apply-templates/>											</xsl:for-each>										</td>									</tr>									<tr>										<td class="td_h_v">											<span>												<xsl:text>Model Name</xsl:text>											</span>										</td>										<td class="td">											<xsl:for-each select="n1:ModelName">												<xsl:apply-templates/>											</xsl:for-each>										</td>									</tr>								</tbody>							</table>						</xsl:variable>						<xsl:variable name="altova:col-count" select="sum( for $altova:cell in $altova:table/table/(thead | tbody | tfoot)[ 1 ]/tr[ 1 ]/(th | td) return altova:col-span( $altova:cell ) )"/>						<xsl:variable name="altova:generate-cols" as="xs:boolean*" select="for $altova:pos in 1 to $altova:col-count return true()"/>						<xsl:apply-templates select="$altova:table" mode="altova:generate-table">							<xsl:with-param name="altova:generate-cols" select="$altova:generate-cols"/>						</xsl:apply-templates>						<xsl:for-each select="n1:MCollection">							<xsl:for-each select="n1:MDetails">								<xsl:if test="../../n1:UsePageBreaks = &apos;true&apos;">									<br class="altova-page-break" clear="all"/>								</xsl:if>								<p/>								<xsl:variable name="altova:table">									<table class="w_16">										<xsl:variable name="altova:CurrContextGrid_1" select="."/>										<xsl:variable name="altova:ColumnData"/>										<tbody>											<tr>												<td class="td_h_v w_4">													<span>														<xsl:text>Measurement Name</xsl:text>													</span>												</td>												<td class="td obj_name w_12">													<xsl:for-each select="n1:MName">														<xsl:apply-templates/>													</xsl:for-each>												</td>											</tr>											<tr>												<td class="td_h_v">													<span>														<xsl:text>Comment</xsl:text>													</span>												</td>												<td class="td">													<xsl:for-each select="n1:MComment">														<xsl:apply-templates/>													</xsl:for-each>												</td>											</tr>											<tr>												<td class="td_h_v">													<span>														<xsl:text>Notes</xsl:text>													</span>												</td>												<td class="td">													<xsl:for-each select="n1:MNotes">														<xsl:apply-templates/>													</xsl:for-each>												</td>											</tr>											<tr>												<td class="td_h_v">													<span>														<xsl:text>Value</xsl:text>													</span>												</td>												<td class="td">													<xsl:for-each select="n1:MValue">														<xsl:apply-templates/>													</xsl:for-each>												</td>											</tr>											<tr>												<td class="td_h_v">													<span>														<xsl:text>Unit</xsl:text>													</span>												</td>												<td class="td">													<xsl:for-each select="n1:MUnit">														<xsl:apply-templates/>													</xsl:for-each>												</td>											</tr>											<tr>												<td class="td_h_v">													<span>														<xsl:text>Type</xsl:text>													</span>												</td>												<td class="td">													<xsl:for-each select="n1:MType">														<xsl:apply-templates/>													</xsl:for-each>												</td>											</tr>											<tr>												<td class="td_h_v">													<span>														<xsl:text>Creation Date</xsl:text>													</span>												</td>												<td class="td">													<xsl:for-each select="n1:MCreationDate">														<xsl:apply-templates/>													</xsl:for-each>												</td>											</tr>											<tr>												<td class="td_h_v">													<span>														<xsl:text>Effective Note</xsl:text>													</span>												</td>												<td class="td">													<xsl:for-each select="n1:MEffectiveDate">														<xsl:apply-templates/>													</xsl:for-each>												</td>											</tr>										</tbody>									</table>								</xsl:variable>								<xsl:variable name="altova:col-count" select="sum( for $altova:cell in $altova:table/table/(thead | tbody | tfoot)[ 1 ]/tr[ 1 ]/(th | td) return altova:col-span( $altova:cell ) )"/>								<xsl:variable name="altova:generate-cols" as="xs:boolean*" select="for $altova:pos in 1 to $altova:col-count return true()"/>								<xsl:apply-templates select="$altova:table" mode="altova:generate-table">									<xsl:with-param name="altova:generate-cols" select="$altova:generate-cols"/>								</xsl:apply-templates>								<xsl:if test="count(n1:MUsedInObjectCollection)">									<p/>									<span class="t_cap">										<xsl:text>Impacted Objects</xsl:text>									</span>									<xsl:variable name="altova:table">										<table class="w_25">											<xsl:variable name="altova:CurrContextGrid_2" select="."/>											<xsl:variable name="altova:ColumnData"/>											<thead>												<tr>													<th class="td_h_h w_8">														<span>															<xsl:text>Model Name</xsl:text>														</span>													</th>													<th class="td_h_h w_8p5">														<span>															<xsl:text>Type</xsl:text>														</span>													</th>													<th class="td_h_h w_8p5">														<span>															<xsl:text>Object Name</xsl:text>														</span>													</th>												</tr>											</thead>											<tbody>												<xsl:for-each select="n1:MUsedInObjectCollection">													<xsl:for-each select="n1:MUsedInObjectDetails">														<tr>															<td class="td">																<xsl:for-each select="n1:ModelName">																	<xsl:apply-templates/>																</xsl:for-each>															</td>															<td class="td">																<xsl:for-each select="n1:TypeName">																	<xsl:apply-templates/>																</xsl:for-each>															</td>															<td class="td">																<xsl:for-each select="n1:ObjectName">																	<xsl:apply-templates/>																</xsl:for-each>															</td>														</tr>													</xsl:for-each>												</xsl:for-each>											</tbody>										</table>									</xsl:variable>									<xsl:variable name="altova:col-count" select="sum( for $altova:cell in $altova:table/table/(thead | tbody | tfoot)[ 1 ]/tr[ 1 ]/(th | td) return altova:col-span( $altova:cell ) )"/>									<xsl:variable name="altova:generate-cols" as="xs:boolean*" select="for $altova:pos in 1 to $altova:col-count return true()"/>									<xsl:apply-templates select="$altova:table" mode="altova:generate-table">										<xsl:with-param name="altova:generate-cols" select="$altova:generate-cols"/>									</xsl:apply-templates>								</xsl:if>							</xsl:for-each>						</xsl:for-each>					</xsl:for-each>				</xsl:for-each>			</body>		</html>	</xsl:template>	<xsl:function name="altova:is-cell-empty" as="xs:boolean">		<xsl:param name="altova:cell" as="element()"/>		<xsl:sequence select="altova:is-node-empty( $altova:cell )"/>	</xsl:function>	<xsl:function name="altova:is-node-empty" as="xs:boolean">		<xsl:param name="altova:node" as="element()"/>		<xsl:sequence select="every $altova:child in $altova:node/child::node() satisfies ( ( boolean( $altova:child/self::text() ) and string-length( $altova:child ) = 0 ) or ( ( boolean( $altova:child/self::div ) or boolean( $altova:child/self::span ) or boolean( $altova:child/self::a ) ) and altova:is-node-empty( $altova:child ) ) )"/>	</xsl:function>	<xsl:function name="altova:col-span" as="xs:integer">		<xsl:param name="altova:cell" as="element()"/>		<xsl:sequence select="if ( exists( $altova:cell/@colspan ) ) then xs:integer( $altova:cell/@colspan ) else 1"/>	</xsl:function>	<xsl:template match="@* | node()" mode="altova:generate-table">		<xsl:param name="altova:generate-cols"/>		<xsl:copy>			<xsl:apply-templates select="@* | node()" mode="#current">				<xsl:with-param name="altova:generate-cols" select="$altova:generate-cols"/>			</xsl:apply-templates>		</xsl:copy>	</xsl:template>	<xsl:template match="tbody" mode="altova:generate-table">		<xsl:param name="altova:generate-cols"/>		<xsl:choose>			<xsl:when test="empty(tr)">				<xsl:copy>					<tr>						<td/>					</tr>				</xsl:copy>			</xsl:when>			<xsl:otherwise>				<xsl:copy>					<xsl:apply-templates select="@* | node()" mode="#current">						<xsl:with-param name="altova:generate-cols" select="$altova:generate-cols"/>					</xsl:apply-templates>				</xsl:copy>			</xsl:otherwise>		</xsl:choose>	</xsl:template>	<xsl:template match="th | td" mode="altova:generate-table">		<xsl:choose>			<xsl:when test="altova:is-cell-empty( . )">				<xsl:copy>					<xsl:apply-templates select="@*" mode="#current"/>					<xsl:text>&#160;</xsl:text>				</xsl:copy>			</xsl:when>			<xsl:otherwise>				<xsl:copy>					<xsl:apply-templates select="@* | node()" mode="#current"/>				</xsl:copy>			</xsl:otherwise>		</xsl:choose>	</xsl:template>	<xsl:function name="altova:GetChartYValuesForSingleSeries">		<xsl:param name="seqCategoryLeafPos" as="node()*"/>		<xsl:param name="nodeSeriesLeafPos" as="node()"/>		<xsl:param name="bValuesInCategory" as="xs:boolean"/>		<xsl:for-each select="$seqCategoryLeafPos">			<xsl:element name="altova:Value">				<xsl:value-of select="altova:GetChartYValueForSingleSeriesPos($nodeSeriesLeafPos, ., $bValuesInCategory)"/>			</xsl:element>		</xsl:for-each>	</xsl:function>	<xsl:function name="altova:GetChartYValueForSingleSeriesPos">		<xsl:param name="nodeSeriesLeafPos" as="node()"/>		<xsl:param name="nodeCategoryLeafPos" as="node()"/>		<xsl:param name="bValuesInCategory" as="xs:boolean"/>		<xsl:variable name="altova:seqCategoryContextIds" select="$nodeCategoryLeafPos/altova:Context/@altova:ContextId" as="xs:string*"/>		<xsl:variable name="altova:seqSeriesContextIds" select="$nodeSeriesLeafPos/altova:Context/@altova:ContextId" as="xs:string*"/>		<xsl:variable name="altova:sCommonContextId" select="for $i in $altova:seqCategoryContextIds return if (some $j in $altova:seqSeriesContextIds satisfies $i eq $j) then $i else ()" as="xs:string*"/>		<xsl:choose>			<xsl:when test="count($altova:sCommonContextId) gt 1">				<xsl:message select="concat('Found several values instead of a single one (contexts: ', string-join($altova:sCommonContextId, ', '), ').')" terminate="yes"/>			</xsl:when>			<xsl:when test="count($altova:sCommonContextId) lt 1">				<xsl:message select="concat('XBRL Chart: Info: No value found for position labeled &quot;', $nodeCategoryLeafPos/@altova:sLabel, '&quot;')" terminate="no"/>				<xsl:sequence select="'altova:no-value'"/>			</xsl:when>			<xsl:when test="$bValuesInCategory">				<xsl:sequence select="xs:string($nodeCategoryLeafPos/altova:Context[@altova:ContextId eq $altova:sCommonContextId]/@altova:Value)"/>			</xsl:when>			<xsl:otherwise>				<xsl:sequence select="xs:string($nodeSeriesLeafPos/altova:Context[@altova:ContextId eq $altova:sCommonContextId]/@altova:Value)"/>			</xsl:otherwise>		</xsl:choose>	</xsl:function>	<xsl:function name="altova:GetChartLabelForPos" as="xs:string">		<xsl:param name="nodeParam" as="node()"/>		<xsl:value-of select="string-join($nodeParam/ancestor-or-self::altova:Pos/@altova:sLabel, ' ')"/>	</xsl:function>	<xsl:function name="altova:convert-length-to-pixel" as="xs:decimal">		<xsl:param name="altova:length"/>		<xsl:variable name="normLength" select="normalize-space($altova:length)"/>		<xsl:choose>			<xsl:when test="ends-with($normLength, 'px')">				<xsl:value-of select="substring-before($normLength, 'px')"/>			</xsl:when>			<xsl:when test="ends-with($normLength, 'in')">				<xsl:value-of select="xs:decimal(substring-before($normLength, 'in')) * $altova:nPxPerIn"/>			</xsl:when>			<xsl:when test="ends-with($normLength, 'cm')">				<xsl:value-of select="xs:decimal(substring-before($normLength, 'cm')) * $altova:nPxPerIn div 2.54"/>			</xsl:when>			<xsl:when test="ends-with($normLength, 'mm')">				<xsl:value-of select="xs:decimal(substring-before($normLength, 'mm')) * $altova:nPxPerIn div 25.4"/>			</xsl:when>			<xsl:when test="ends-with($normLength, 'pt')">				<xsl:value-of select="xs:decimal(substring-before($normLength, 'pt')) * $altova:nPxPerIn div 72.0"/>			</xsl:when>			<xsl:when test="ends-with($normLength, 'pc')">				<xsl:value-of select="xs:decimal(substring-before($normLength, 'pc')) * $altova:nPxPerIn div 6.0"/>			</xsl:when>			<xsl:otherwise>				<xsl:value-of select="$normLength"/>			</xsl:otherwise>		</xsl:choose>	</xsl:function>	<xsl:function name="altova:convert-length-to-mm" as="xs:decimal">		<xsl:param name="altova:length"/>		<xsl:variable name="normLength" select="normalize-space($altova:length)"/>		<xsl:choose>			<xsl:when test="ends-with($normLength, 'px')">				<xsl:value-of select="xs:decimal(substring-before($normLength, 'px')) div $altova:nPxPerIn * 25.4"/>			</xsl:when>			<xsl:when test="ends-with($normLength, 'in')">				<xsl:value-of select="xs:decimal(substring-before($normLength, 'in')) * 25.4"/>			</xsl:when>			<xsl:when test="ends-with($normLength, 'cm')">				<xsl:value-of select="xs:decimal(substring-before($normLength, 'cm')) * 10"/>			</xsl:when>			<xsl:when test="ends-with($normLength, 'mm')">				<xsl:value-of select="substring-before($normLength, 'mm') "/>			</xsl:when>			<xsl:when test="ends-with($normLength, 'pt')">				<xsl:value-of select="xs:decimal(substring-before($normLength, 'pt')) * 25.4 div 72.0"/>			</xsl:when>			<xsl:when test="ends-with($normLength, 'pc')">				<xsl:value-of select="xs:decimal(substring-before($normLength, 'pc')) * 25.4 div 6.0"/>			</xsl:when>			<xsl:otherwise>				<xsl:value-of select="number($normLength) div $altova:nPxPerIn * 25.4"/>			</xsl:otherwise>		</xsl:choose>	</xsl:function></xsl:stylesheet>